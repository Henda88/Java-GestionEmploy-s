
public class main {

	public static void main(String[] args) {

		Magasin m1 = new Magasin(1, "Carrefour", "Centre ville");
		Magasin m2 = new Magasin(2, "Monoprix", "Menzah6");

		// *** Cr�er 2 caissiers, un vendeur et un responsable pour le premier magasin
		Employe c1 = new Caissier(12, "Amir", "Ariana", 8, 5);
		Caissier c2 = new Caissier(15, "Elyes", "Lac", 7, 4);
		Vendeur v1 = new Vendeur(8, "Haythem", "Rades", 6, 0.5);
        Responsable r1 = new Responsable(1, "Ahmed", "Tunis", 10, 300);
        
		m1.ajouterCaissier(c1);
		m1.ajouterCaissier(c2);
		m1.ajouterVendeur(v1);
		m1.ajouterResponsable(r1);
		System.out.println(m1.toString());
        

		// *** 3 vendeurs et un responsable pour le deuxi�me magasin.
		Vendeur v2 = new Vendeur(9, "Henda", "Tunis", 6, 1.5);
		Vendeur v3 = new Vendeur(10, "Abir", "Manar", 6, 2);
		Vendeur v4 = new Vendeur(11, "Firas", "Rades", 6, 2.5);
		Responsable r2 = new Responsable(2, "Seif", "Tunis", 12, 300);
		
		m2.ajouterVendeur(v2);
		m2.ajouterVendeur(v3);
		m2.ajouterVendeur(v4);
		m2.ajouterResponsable(r2);
		System.out.println(m2.toString());
		
		// **** 3.	Afficher les caract�ristiques des employ�s d�j� cr��s 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(v1);
		System.out.println(r1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(r2);
		
		
		System.out.println("*************************************************");
		// ***  4.	Cr�er et ajouter quelques produits pour chaque magasin
		
		Produit p6 = new Produit(105, "Biscuit", 10, "juin");
		//Produit p2 = new Produit(107, "Chocolat", "Milka", 4);
		//Produit p3 = new Produit(109, "Lait", "Delice", 1.8);
		//Produit p4 = new Produit(111, "Yaourt", "Bifi", 0.5);
		
		m1.ajouterProduit(p6);
		//m1.ajouterProduit(p2);
		//m2.ajouterProduit(p3);
		//m2.ajouterProduit(p4);
		
		//*** 5.	Afficher tous les d�tails de chaque magasin (id, nom, adresse, capacit�, les produits et les employ�s).
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		System.out.println("*************************************************");
		
		// *** 6.  Afficher liste des employ�s 

		m1.afficherListe();
		m2.afficherListe();
		
		// *** 7.  Calculer et afficher les diff�rents salaires pour les diff�rents employ�s 
		
		System.out.println("le nomre d'heures :" + r1.getNbr_heures());
		System.out.println(r1.calculHeureSupp());
		System.out.println(r1.calculSalaire());
		System.out.println(c1.getNbr_heures());
		System.out.println(c1.calculHeureSupp());
		System.out.println(c1.calculSalaire());
		System.out.println(v1.getNbr_heures());
		System.out.println(v1.calculHeureSupp());
		System.out.println(v1.calculSalaire());
		
		
		// *** 2.	Cr�er les produits suivants : 
		
		Produit p1 = new Fruit(1254, "Fraise", 12.3, "Mars", "Fruit");
		Produit p2 = new Fruit(1224, "Past�que", 50, "Juin", "Fruit");
		Produit p3 = new Fruit(7896, "Mandarine", 25.6, "D�cembre", "Fruit");
		Produit p4 = new L�gumes(8521, "Artichauts", 14, "Janvier", "L�gumes");
		
		// *** 3.	Utiliser la m�thode � ajouterProduit(Produit p) � pour ajouter ces produits � un magasin  
		
		m1.ajouterProduit(p1);
		m1.ajouterProduit(p2);
		m1.ajouterProduit(p3);
		m1.ajouterProduit(p4);
		
		System.out.println(m1.toString());
		
		
		// *** 4.	Pour chaque produit de type Fruit on souhaite calculer la quantit� totale de produit  
		
		System.out.println(m1.calculStock());
		
		// *** 5.	Cr�er une nouvelle interface nomm�e � Critere � qui contient la m�thode estFrais(String saison)
		
		
		System.out.println("si frais"+((Fruit)p1).estFrais("Mars"));
		System.out.println("si frais"+((Fruit)p2).estFrais("Juillet"));
		System.out.println("si frais"+((Fruit)p3).estFrais("D�cembre"));
		System.out.println("si frais"+((L�gumes)p4).estFrais("F�vrier"));
		
		
	}

}
