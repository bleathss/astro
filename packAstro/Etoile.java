package packAstro;

public class Etoile extends ObjetCeleste {

    public int magnitude;
    public char ageLettre;
    public static int Type = 0;
    public Galaxie g;

    public Etoile (String nom, int magnitude, char ageLettre, Galaxie g) {
        super(nom, 0);
        this.ageLettre = ageLettre;
        this.magnitude = magnitude;
        this.g = g;
    }

    public void setType (int val) {
        this.Type = val;
    }

    public String toString () {
        return this.id + "- << " + this.nom + " >> : Etoile ; Galaxie : " + this.g.nom + " : age " + this.ageLettre + " : " + this.mSatellites.size() + " Satellite(s)";
    }

}

