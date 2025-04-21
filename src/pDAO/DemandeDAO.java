package pDAO;

import java.sql.SQLException;
import java.util.List;
import pBeans.Demande;

public interface DemandeDAO {
	 
	 void supprimer (String id1) throws ClassNotFoundException;
	 List<Demande> lister();
	void ajouter(Demande demande) throws SQLException, ClassNotFoundException;
	 

}

