package pDAO;

import java.util.List;
import pBeans.Contrat;

public interface ContratDAO {
	 void ajouter( Contrat C ) throws ClassNotFoundException;
	 List<Contrat> lister() throws ClassNotFoundException;
	 

}
