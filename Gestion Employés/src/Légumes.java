
public class L�gumes extends Produit implements Critere {

	private String type = "l�gumes";

	public L�gumes() {
		super();
	}

	public L�gumes(int id, String libelle, double quantit�, String saison, String type) {
		super(id, libelle, quantit�, saison);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "L�gumes [" + super.toString() + ", type =" + type + "]";
	}

	@Override
	public boolean estFrais(String saison) {

		if (saison == getSaison()) {

			return true;
		}

		return false;

	}

}
