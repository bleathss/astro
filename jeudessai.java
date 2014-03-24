import java.util.ArrayList; 
import packAstro.Galaxie; 
import packAstro.ObjetCeleste; 
import packAstro.ObjetFroid; 
import packAstro.Etoile; 
import packGestion.Univers;
class jeudessai {
	public static Univers u;
	public static void init()
	{
		/*  ------- Initialisation Jeu D'essai (0) ------- */
		u = Univers.getUnivers();
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

	public static void main (String[] args){
		System.out.println("Hello World");
		init();

		/*  ------- Initialisation Jeu D'essai (2) ------- */
		/*  ------- Initialisation Jeu D'essai (3) ------- */
		/*  ------- Initialisation Jeu D'essai (4) ------- */
		/*  ------- Initialisation Jeu D'essai (5) ------- */
		/*  ------- Initialisation Jeu D'essai (6) ------- */
		/*  ------- Initialisation Jeu D'essai (7) ------- */
		/*  ------- Initialisation Jeu D'essai (8) ------- */
		/*  ------- Initialisation Jeu D'essai (9) ------- */
		/*  ------- Quitter (10) ------- */


		ArrayList<ObjetCeleste> test = new ArrayList<ObjetCeleste>();
		test = u.getObjets(u.getGalaxie("VoieLactee"));
		for(ObjetCeleste t : test)
		{
			System.out.println(t.toString());
		}
	}
}