
public class Caissier extends Employe{

	private int numeroCaisse;


	public Caissier() {
		super();
	}

	public Caissier(int id, String nom, String adresse, int nbr_heures, int numeroCaisse) {
		super(id, nom, adresse, nbr_heures);
		this.numeroCaisse = numeroCaisse;
	}

	public int getNumeroCaisse() {
		return numeroCaisse;
	}

	public void setNumeroCaisse(int numeroCaisse) {
		this.numeroCaisse = numeroCaisse;
	}

	@Override
	public String toString() {
		return "Caissier [" + super.toString() + "numeroCaisse=" + numeroCaisse + "]";
	}

	public int calculHeureSupp() {

		if (getNbr_heures() > 180) {
			return getNbr_heures() - 180;
		} else {

			return 0;
		}
	}
	
	@Override
	public double calculSalaire() {
		
		return (getNbr_heures() * 5) + calculHeureSupp()* 1.15;
	}



	
}
