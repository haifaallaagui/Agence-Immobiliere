package pBeans;


public class Offres {
	private String idoffres;
	private String type;
	private String prix;
	private String localisation;
	private String image ;
	public String getIdoffres() {
		return idoffres;
	}

	public void setIdoffres(String string) {
		this.idoffres = string;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	

}
