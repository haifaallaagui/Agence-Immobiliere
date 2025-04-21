package pDAO;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import pBeans.Contrat;
import pBeans.Paiement;

public class ContratDAOimp implements ContratDAO {

	@Override
	public void ajouter(Contrat C) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 Connection connexion ;
		  
	    	
         try {
         Class.forName("com.mysql.jdbc.Driver");
         connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
     
         PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO contrat VALUES (?, ?, ?)");
         preparedStatement.setString(1, C.getIdcontrat());
         preparedStatement.setString(2, C.getContrat());   
         preparedStatement.setString(3,"gérant");  
         preparedStatement.executeUpdate();
         System.out.println("inserted");
 } catch (SQLException e) {
     e.printStackTrace();
 }

}
	
	@Override
	public List<Contrat> lister() throws ClassNotFoundException {
		List<Contrat> Contrat1 = new ArrayList<Contrat>();


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
            rs = st.executeQuery("SELECT * FROM contrat ");
            while (rs.next()) {
            	String id = rs.getString("idcontrat");
                String contrat = rs.getString("contrat");
   

                System.out.println(id);
  
                Contrat C =new Contrat();
                C.setIdcontrat(id);
                C.setContrat(contrat);
                
                Contrat1.add(C);
               
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
    return Contrat1;
}
}