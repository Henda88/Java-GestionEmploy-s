import java.util.ArrayList;
import java.util.List;

public class Magasin {

	private int id;
	private String nom;
	private String adresse;
	private int capacite = 0;
	private float totalStock = 0;
	private List<Produit> ListProduit = new ArrayList<Produit>();
	private List<Employe> ListEmploye = new ArrayList<Employe>();

	public Magasin() {
	}

	public Magasin(int id, String nom, String adresse) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
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

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public void ajouterProduit(Produit produit) {
		ListProduit.add(produit);
	}

	public void ajouterCaissier(Employe caissier) {
		if (capacite < 20) {
			ListEmploye.add(caissier);
			capacite++;
		} else {
			System.out.println("Vous avez dépassé la capacité du magasin");
		}
	}

	public void ajouterResponsable(Employe responsable) {
		if (capacite < 20) {
			ListEmploye.add(responsable);
			capacite++;
		} else {
			System.out.println("Vous avez dépassé la capacité du magasin");
		}
	}

	public void ajouterVendeur(Employe vendeur) {
		if (capacite < 20) {
			ListEmploye.add(vendeur);
			capacite++;
		} else {
			System.out.println("Vous avez dépassé la capacité du magasin");
		}
	}

	@Override
	// public String toString() {
	// return "Magasin [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ",
	// Produit= "+ ListProduit+"]";
	// }

	public String toString() {
		return "Magasin [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", capacité=" + capacite + ", Produit= "
				+ ListProduit + ", Employé=" + ListEmploye + "]";
	}

	public void afficherListe() {


			System.out.println(ListEmploye);

	}

	public float calculStock() {

		for (Produit prod : ListProduit) {
			if (prod instanceof Fruit) {
				
				totalStock += prod.getQuantité();
			}
		}
		return totalStock;
	}

	public float getTotalStock() {
		return totalStock;
	}

	public void setTotalStock(float totalStock) {
		this.totalStock = totalStock;
	}

}
