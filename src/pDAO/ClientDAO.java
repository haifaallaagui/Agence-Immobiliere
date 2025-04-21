package pDAO;

import java.util.List;

import pBeans.Client;

public interface ClientDAO {
	 void ajouter( Client client ) throws ClassNotFoundException;
	 List<Client> lister() throws ClassNotFoundException;
	void supprimer(String id) throws ClassNotFoundException;
	void modifier(Client client) throws ClassNotFoundException;
	 

}
