package packAstro;
import packGestion.Univers;
import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.43032C9B-B031-8187-89A2-10595DC15AAA]
// </editor-fold> 
public abstract class ObjetCeleste {

    public ArrayList<ObjetFroid> mSatellites;
    public int id;
    public String nom;
    public int Type;

    public ObjetCeleste (String nom, int Type) {
        this.nom = nom;
        this.Type = Type;
        this.id = Univers.IncrementeId();
        /* Not sure if this is needed!!!*/
        this.mSatellites = new ArrayList<>();
    }
    public void addSatellite(ObjetFroid of)
    {
        if(of.Type == 1)
        {
            this.mSatellites.add(of);
        }
    }
    public static ObjetCeleste s_getObjet (int num) {
        return null;
    }
    public String getType () {
        if (this.Type ==0)
            return "Etoile";
        if (this.Type ==1)
            return "Planete";
        if (this.Type ==2)
            return "Planete naine";
        if (this.Type ==3)
            return "ExoPlanete";
        if (this.Type ==4)
            return "Lune";
        return "";
    }
    /*
    public Galaxie getGalaxie () {
        return this.Type == 0;
    }*/
    public int nbDeSatellites () {
        return mSatellites.size();
    }

    public ArrayList<ObjetFroid> getSatellites () {
        return mSatellites;
    }
    public void setType (int val) {
        this.Type = val;
    }
}

