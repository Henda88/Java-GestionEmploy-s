
public class Responsable extends Employe {

	private float prime;

	public Responsable() {
		super();
	}

	public Responsable(int id, String nom, String adresse, int nbr_heures, float prime) {
		super(id, nom, adresse, nbr_heures);
		this.prime = prime;
	}

	public float getPrime() {
		return prime;
	}

	public void setPrime(float prime) {
		this.prime = prime;
	}

	@Override
	public String toString() {
		return "Responsable [" + super.toString() + " prime=" + prime + "]";
	}

	public int calculHeureSupp() {

		if (getNbr_heures() > 160) {
			return getNbr_heures() - 160;
		} else {

			return 0;
		}
	}

	@Override
	public double calculSalaire() {

		return ( getNbr_heures()* 10) + calculHeureSupp()* 1.2;
	}

}
