
public interface Critere {

	// la m�thode estFrais(String saison) qui se comporte comme suit :
	//a.	Pour un ProduitFruit : retourne true si la saison pass�e en param�tre est identique � la saison de r�colte du produit
	//b.	Pour un ProduitLegume : retourne true si la saison pass�e en param�tre n�est pas identique � la saison du r�colte
	//c.	//ne d�passe pas la saison de r�colte du produit de plus que 1 mois 
	

	public boolean estFrais(String saison);

}
