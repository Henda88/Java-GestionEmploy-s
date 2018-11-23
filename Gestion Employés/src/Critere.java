
public interface Critere {

	// la méthode estFrais(String saison) qui se comporte comme suit :
	//a.	Pour un ProduitFruit : retourne true si la saison passée en paramètre est identique à la saison de récolte du produit
	//b.	Pour un ProduitLegume : retourne true si la saison passée en paramètre n’est pas identique à la saison du récolte
	//c.	//ne dépasse pas la saison de récolte du produit de plus que 1 mois 
	

	public boolean estFrais(String saison);

}
