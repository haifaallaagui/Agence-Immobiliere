package pDAO;

import java.util.List;



import java.sql.*;
import pBeans.Client;

import java.util.ArrayList;

public class ClientDAOimp implements ClientDAO{
	@Override
	public List<Client> lister() throws ClassNotFoundException {
		
		List<Client> client = new ArrayList<Client>();


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
            rs = st.executeQuery("SELECT * FROM client ");
            while (rs.next()) {
            	String cin = rs.getString("cinC");
                String nomc = rs.getString("nom");
                String prenomc = rs.getString("prenom");
                String dn = rs.getString("datenaissance");
                String adresse =rs.getString("adresse");
                String tel=rs.getString("numtel");
                String demande1=rs.getString("demande");
                String image=rs.getString("image");
                System.out.println(cin+nomc+prenomc+dn+tel);
  
                Client C =new Client();
                C.setCinC(cin);
                C.setNom(nomc);
                C.setPrenom(prenomc);
                C.setDatenaissance(dn);
                C.setAdresse(adresse);
                C.setNumtel(tel);
                C.setDemande(demande1);
                C.setImage(image);
                
                client.add(C);
               
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
    return client;
	    
	        } 
	

	@Override
	public void ajouter(Client client) throws ClassNotFoundException {
		
		  Connection connexion ;
	  
	    	
	                try {
	                Class.forName("com.mysql.jdbc.Driver");
	                connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
	            
	                PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO client VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
	                preparedStatement.setString(1, client.getCinC());
	                preparedStatement.setString(2, client.getNom());

	                preparedStatement.setString(3, client.getPrenom());
	           
	                preparedStatement.setString(4,client.getDatenaissance());
	                preparedStatement.setString(5, client.getAdresse());
	                preparedStatement.setString(6, client.getNumtel());
	                preparedStatement.setString(7, client.getDemande());
	                preparedStatement.setString(8,client.getImage());            

	                preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
	}

	public void supprimer(String id) throws ClassNotFoundException {
		
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;

	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
	        preparedStatement = connexion.prepareStatement("DELETE FROM client where cinC=?");
	       
	        preparedStatement.setString(1, id);
	        
	        preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	}


	@Override
	public void modifier(Client client) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}



	
}
