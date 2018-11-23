
public class Vendeur extends Employe {

	private double tauxDeVente;

	public Vendeur() {
		super();
	}

	public Vendeur(int id, String nom, String adresse, int nbr_heures, double tauxDeVente) {
		super(id, nom, adresse, nbr_heures);
		this.tauxDeVente = tauxDeVente; 
	}

	public double getTauxDeVente() {
		return tauxDeVente;
	}

	public void setTauxDeVente(double tauxDeVente) {
		this.tauxDeVente = tauxDeVente;
	}

	@Override
	public String toString() {
		return "Vendeur [" + super.toString() + "tauxDeVente= " + tauxDeVente +"]";
	}

	@Override
	public double calculSalaire() {
		
		return getTauxDeVente()*450;
	}

	@Override
	public int calculHeureSupp() {
		return 0;
	}

	
}
