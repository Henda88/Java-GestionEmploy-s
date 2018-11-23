
public class Produit {

	private int id; 
	private String libelle; 
	private double quantité; 
	private String saison;
	
	
	
	public Produit() {
		super();
	}
	public Produit(int id, String libelle, double quantité, String saison) {
		this.id = id;
		this.libelle = libelle;
		this.quantité = quantité;
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
	public double getQuantité() {
		return quantité;
	}
	public void setQuantité(double quantité) {
		this.quantité = quantité;
	}
	public String getSaison() {
		return saison;
	}
	public void setSaison(String saison) {
		this.saison = saison;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", libelle=" + libelle + ", quantité=" + quantité + ", saison=" + saison + "]";
	}
	
}
