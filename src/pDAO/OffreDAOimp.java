package pDAO;

import java.util.List;
import java.sql.PreparedStatement;


import pBeans.Offres;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;

public class OffreDAOimp implements OffreDAO {
	
	ArrayList<Offres> list = new ArrayList<>();
	


	public List<Offres> lister() throws ClassNotFoundException {
		List<Offres> Offres = new ArrayList<Offres>();


            try {
                Class.forName("com.mysql.jdbc.Driver");
            }catch (ClassNotFoundException s) {
		}
                Connection con = null;
                Statement st = null;
                ResultSet rs=null;
                try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
                st= con.createStatement();
                rs = st.executeQuery("SELECT * FROM offres ");
                while (rs.next()) {
                	String idoffres = rs.getString("idoffres");
                    String type = rs.getString("type");
                    String prix = rs.getString("prix");
                    String localisation = rs.getString("localisation");
                    String image=rs.getString("image");
                    System.out.println(idoffres+type+prix+localisation+image);
      
                    Offres offre =new Offres();
                    offre.setIdoffres(idoffres);
                    offre.setType(type);
                    offre.setPrix(prix);
                    offre.setLocalisation(localisation);
                    offre.setImage(image);
                    
                    Offres.add(offre);
                   
            }
        } catch (SQLException e) {
        }finally {
        	try {
        		if (rs!=null)
        			rs.close();
        		if (st!=null)
        			st.close();
        		if (con!=null)
        			con.close();
        	}catch(SQLException ignore) {
        	}
        }
        return Offres;
}


		@Override
		public void ajouter(Offres offre) throws SQLException, ClassNotFoundException{
			Connection connexion;
			String nomp="gerant";
			String id=offre.getIdoffres();
			String type=offre.getType();
			String prix=offre.getPrix();
			String localisation=offre.getLocalisation();
			String img= offre.getImage();
			
		
			try {
			Class.forName("com.mysql.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
			PreparedStatement pr =connexion.prepareStatement("insert into offres values (?,?,?,?,?,?)");
			pr.setString(1, id);
			pr.setString(2, type);
			pr.setString(3,prix);
			pr.setString(4,localisation);
			pr.setString(5,img);
			pr.setString(6,nomp);

			
			pr.executeUpdate();
			 System.out.println("inserted");
			}catch(SQLException s) {
				s.printStackTrace();
			}
		}
		   
	        


		public void supprimer(String id) throws ClassNotFoundException {
			
			Connection connexion = null;
		    PreparedStatement preparedStatement = null;

		    try {
		    	Class.forName("com.mysql.jdbc.Driver");
	            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
		        preparedStatement = connexion.prepareStatement("DELETE FROM offres where idoffres=?");
		       
		        preparedStatement.setString(1, id);
		        
		        preparedStatement.executeUpdate();
		        System.out.println("deleted");
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		}
	
}
