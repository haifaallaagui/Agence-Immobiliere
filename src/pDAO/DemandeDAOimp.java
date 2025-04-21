package pDAO;

import java.util.ArrayList;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pBeans.Demande;

public class DemandeDAOimp implements DemandeDAO {


@Override
public void supprimer(String id1) throws ClassNotFoundException {
	// TODO Auto-generated method stub
	Connection connexion ;
    PreparedStatement preparedStatement = null;

    try {
    	Class.forName("com.mysql.jdbc.Driver");
		connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
        preparedStatement = connexion.prepareStatement("DELETE FROM demande where numD=?");
        preparedStatement.setString(1, id1);
        
        preparedStatement.executeUpdate();
        System.out.println("deleted");

        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }

}

@Override
public List<Demande> lister() {
	List<Demande> demande = new ArrayList<Demande>();


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
        rs = st.executeQuery("SELECT * FROM demande ;");
        while (rs.next()) {
        	String id = rs.getString("numD");
            String demande1 = rs.getString("demande");
            String nomc = rs.getString("client_nom");
            String cin = rs.getString("client_cin");
            String tel = rs.getString("client_numtel");
            String offre = rs.getString("client_numoffre");
            String prenomc = rs.getString("client_prenom");
            String planning =rs.getString("planning")   ;     

            Demande D =new Demande();
            D.setNumD(id);
            D.setDemande(demande1);
            D.setNomclient(nomc);
            D.setCinclient(cin);
            D.setNumtelClient(tel);
            D.setNumoffresclient(offre);
            D.setPrenomclient(prenomc);
            D.setRendezvous(planning);
            demande.add(D);
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
return demande;
}

	public void ajouter(Demande demande) throws SQLException, ClassNotFoundException{
	Connection connexion;
	String id = demande.getNumD();
    String demande1 = demande.getDemande();
    String nomc = demande.getNomclient();
    String cin = demande.getCinclient();
    String tel = demande.getNumtelClient();
    String offre = demande.getNumoffresclient();
    String prenomc = demande.getPrenomclient();
    String planning =demande.getRendezvous()  ;     
	

	try {
	Class.forName("com.mysql.jdbc.Driver");
	connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
	PreparedStatement pr =connexion.prepareStatement("insert into demande values (?,?,?,?,?,?,?,?)");
	pr.setString(1, demande1);
	pr.setString(2, id);
	pr.setString(3,nomc);
	pr.setString(4,cin);
	pr.setString(5,tel);
	pr.setString(6,offre);
	pr.setString(7,prenomc);
	pr.setString(8,planning);
	pr.executeUpdate();
	 System.out.println("inserted");
	}catch(SQLException s) {
		s.printStackTrace();
	}
}
   


	
}


