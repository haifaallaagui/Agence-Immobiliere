package pBeans;


public class Contrat {
	private String idcontrat ;
	private String contrat;
	public Contrat() {
		this.idcontrat=this.idcontrat+1;
	}
	public String getIdcontrat() {
		return idcontrat;
	}
	public void setIdcontrat(String idcontrat) {
		this.idcontrat = idcontrat;
	}
	public String getContrat() {
		return contrat;
	}
	public void setContrat(String contrat) {
		this.contrat = contrat;
	}
	

}