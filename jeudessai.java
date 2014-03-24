class Jeudessai {
	public static void main (String[] args){
		System.out.println("Hello World");
		Univers u = Univers.getUnivers();
		u.creerGalaxie("VoieLactee", "spirale", 0);
		u.creerEtoile("Soleil", 0, F, u.getGalaxie("VoieLactee"));
		u.creerObjetFroid("Terre", 150000 , 13000 , 365 , ObjetCeleste oc);
		u.creerObjetFroid("Mars", 200000 , 11000 , 750 , ObjetCeleste oc);
		u.creerObjetFroid("Pluton", 1200000 , 50000 , 900 , ObjetCeleste oc);
    }
	}
}