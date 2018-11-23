
public abstract class Employe {

	private int id; 
	private String nom; 
	private String adresse; 
	private int nbr_heures;


	public Employe() {
		super();
	}
	public Employe(int id, String nom, String adresse, int nbr_heures) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbr_heures = nbr_heures;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbr_heures() {
		return nbr_heures * 30 ;
	}
	public void setNbr_heures(int nbr_heures) {
		this.nbr_heures = nbr_heures;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures=" + nbr_heures
				+ "]";
	} 
	
	public void afficher() {
		System.out.println("Employe [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures=" + nbr_heures
				+ "]");
	}
	
	public abstract double calculSalaire();
	public abstract int calculHeureSupp();

	
}


