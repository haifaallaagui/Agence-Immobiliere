package pDAO;
import java.sql.SQLException;
import java.util.List;


import pBeans.Offres;


public interface OffreDAO {
	 void ajouter( Offres offre ) throws SQLException, ClassNotFoundException;
	 public List <Offres> lister() throws ClassNotFoundException, SQLException;
	void supprimer(String id) throws SQLException, ClassNotFoundException;
}
