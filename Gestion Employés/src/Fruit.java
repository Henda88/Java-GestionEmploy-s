
public class Fruit extends Produit implements Critere {

	private String type = "fruit";
	

	public Fruit() {
		super();
	}

	public Fruit(int id, String libelle, double quantit�, String saison, String type) {
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
		return "Fruit [" + super.toString() + ", type =" + type + "]";
	}

	@Override
	public boolean estFrais(String saison) {
		if (saison == getSaison()) {
			
			return true; 
		}
		
		return false; 
		
	}

	
		//a.	Pour un ProduitFruit : retourne true si la saison pass�e en param�tre est identique � la saison de r�colte du produit
		
		

	
	
}
