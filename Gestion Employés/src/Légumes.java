
public class Légumes extends Produit implements Critere {

	private String type = "légumes";

	public Légumes() {
		super();
	}

	public Légumes(int id, String libelle, double quantité, String saison, String type) {
		super(id, libelle, quantité, saison);
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
		return "Légumes [" + super.toString() + ", type =" + type + "]";
	}

	@Override
	public boolean estFrais(String saison) {

		if (saison == getSaison()) {

			return true;
		}

		return false;

	}

}
