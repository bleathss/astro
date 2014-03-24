import java.util.ArrayList; 
import packAstro.Galaxie; 
import packAstro.ObjetCeleste; 
import packAstro.ObjetFroid; 
import packAstro.Etoile; 
import packGestion.Univers;
import java.util.*;
class jeudessai {
	public static Univers u;
	public static void init()
	{
		/*  ------- Initialisation Jeu D'essai (0) ------- */
		
		u.creerGalaxie("VoieLactee", "spirale", 0);
		u.creerEtoile("Soleil", 0, 'F', u.getGalaxie("VoieLactee")); //1
		u.creerObjetFroid("Terre", 150000 , 13000 , 365 , u.getObjet(1)); //2

		u.creerObjetFroid("Lune", 200 , 5000 , 30 , u.getObjet(2)); //3

		u.creerObjetFroid("Mars", 200000 , 11000 , 750 , u.getObjet(1)); //4

		u.creerObjetFroid("Phobos", 150 , 500 , 40 , u.getObjet(4)); //5

		u.creerObjetFroid("Pluton", 1200000 , 50000 , 900 , u.getObjet(1)); //6

		u.creerEtoile("Sirius", 2, 'B', u.getGalaxie("VoieLactee")); //7

		u.creerObjetFroid("BIG-1", 1000 , 50000 , 333 , u.getObjet(7)); //8

		u.creerGalaxie("M31", "lenticulaire", 900000);
		u.creerEtoile("XS67", 8, 'F', u.getGalaxie("M31")); //9
		u.creerObjetFroid("XP88", 160000 , 40000 , 400 , u.getObjet(9)); //10
	}
	public static void affCarac(int x)
	{
		System.out.println(u.getObjet(x).toString());
	}	
	public static void affGalaxies()
	{
		for(Galaxie g : u.mGalaxie)
		{
			System.out.println("nom : "+g.nom+"; Type : "+g.type+"; Eloignement : "+g.eloignement+";");
		}
	}
	public static void listGalax(Galaxie g)
	{

	}

	public static void main (String[] args){
		u = Univers.getUnivers();
		/*init();
		affCarac(1);
		affGalaxies();*/
		boolean pasFini = true;
		Scanner sc = new Scanner(System.in);
		int res = 0;
		int nb;
		while (pasFini)
		{
			System.out.println("----- MENU -----");
			System.out.println("O. Initialiser le systeme avec le jeu d'essai ci-dessous.");
			System.out.println("1. Afficher les caracteristiques d'un objet. Max : "+u.getNextId());
			System.out.println("2. Lister toutes les galaxies : nom, type, eloigement");
			System.out.println("3. Lister tous les objets de la galaxie x");
			System.out.println("4. Lister les satellites de l'objet x");
			System.out.println("5. Afficher le nb total d'etoiles repertoriees dans l'univers");
			System.out.println("6. Afficher les caracteristiques du plus gros objet froid");
			System.out.println("7. Ajouter une nouvelle etoile");
			System.out.println("8. Ajouter un nouvel objet froid a une etoile ou a un objet froid");
			System.out.println("9. Ajouter une galaxie (nom, type, eloignement)");
			System.out.println("10. Quitter");

			res = sc.nextInt();
			switch(res)
			{
				case 0:
					init();
				break;
				case 1:
					nb = sc.nextInt();
					affCarac(nb);
				break;
				case 10:
					pasFini = false;
				break;
				default:
					System.out.println("Choix non reconnu.");
				break;

			}

		}

		/*ArrayList<ObjetCeleste> test = new ArrayList<ObjetCeleste>();
		test = u.getObjets(u.getGalaxie("VoieLactee"));
		for(ObjetCeleste t : test)
		{
			System.out.println(t.toString());
		}*/
	}
}