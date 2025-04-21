package pDAO;

import java.util.List;
import pBeans.Paiement;

public interface PaiementDAO {
	void ajouter( Paiement P ) throws ClassNotFoundException;
	 List<Paiement> lister() throws ClassNotFoundException;
}
