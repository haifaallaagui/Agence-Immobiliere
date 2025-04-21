package pDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pBeans.Offres;
import pBeans.Paiement;

public class PaiementDAOimp implements PaiementDAO{

	@Override
	public void ajouter(Paiement P) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		 Connection connexion ;
		  
	    	
         try {
         Class.forName("com.mysql.jdbc.Driver");
         connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
     
         PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO paiement VALUES (?, ?, ?, ?, ?, ?)");
         preparedStatement.setString(1, P.getIdp());
         preparedStatement.setString(2, P.getNcinC());

         preparedStatement.setString(3, P.getNomC());
    
         preparedStatement.setString(4,P.getPrenomC());
         preparedStatement.setString(5, P.getDemande());
         preparedStatement.setString(6, P.getPrix());       

         preparedStatement.executeUpdate();
         System.out.println("inserted");
 } catch (SQLException e) {
     e.printStackTrace();
 }

}
	
	@Override
	public List<Paiement> lister() throws ClassNotFoundException {
		List<Paiement> Paiements1 = new ArrayList<Paiement>();


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
            rs = st.executeQuery("SELECT * FROM paiement ");
            while (rs.next()) {
            	String id = rs.getString("idp");
                String cinc = rs.getString("ncinC");
                String nom = rs.getString("nomC");
                String prenom = rs.getString("prenomC");
                String demande1=rs.getString("demande");
                String price=rs.getString("prix");

                System.out.println(id+cinc+nom+prenom+demande1);
  
                Paiement paiements =new Paiement();
                paiements.setIdp(id);
                paiements.setNcinC(cinc);
                paiements.setNomC(nom);
                paiements.setPrenomC(prenom);
                paiements.setDemande(demande1);
                
                paiements.setPrix(price);
                
                Paiements1.add(paiements);
               
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
    return Paiements1;
}

	}


