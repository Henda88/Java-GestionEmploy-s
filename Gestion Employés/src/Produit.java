
public class Produit {

	private int id; 
	private String libelle; 
	private double quantit�; 
	private String saison;
	
	
	
	public Produit() {
		super();
	}
	public Produit(int id, String libelle, double quantit�, String saison) {
		this.id = id;
		this.libelle = libelle;
		this.quantit� = quantit�;
		this.saison = saison;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(double quantit�) {
		this.quantit� = quantit�;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", quantit�=" + quantit� + ", saison=" + saison + "]";
	}
	
}
