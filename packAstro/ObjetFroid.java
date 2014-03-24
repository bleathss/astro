package packAstro;
import java.util.ArrayList;

public class ObjetFroid extends ObjetCeleste {

    public int rayonOrbite;
    public int diametre;
    public int periodeRev;
    public int Type;
    public ObjetCeleste mObjetCeleste; /* est satellite de mObjetCeleste ? */

    public ObjetFroid (String nom, int rayonOribte, int diametre, int period, ObjetCeleste oc) {
        super(nom, 1);
        this.diametre = diametre;
        this.rayonOrbite = rayonOrbite;
        this.periodeRev = period;
        this.mObjetCeleste = oc;
    }
    public ObjetCeleste getCentre () {
        return mObjetCeleste;
    }
    
    @Override
    public String toString () {
        return this.id + "- << " + this.nom + " >> : Planete ; Galaxie : " 
        + this.getGalaxie(this.mObjetCeleste).nom + " ; diam : " + this.diametre 
        + ", gravte autour de " + this.mObjetCeleste.nom + " a " + this.periodeRev 
        + "km ; " + this.mSatellites.size() + " satellite." ;
    }
    public Galaxie getGalaxie(ObjetCeleste oc)
    {
        return (oc.Type != 0) ? this.getGalaxie(((ObjetFroid)oc).mObjetCeleste): ((Etoile)oc).g;
    }
    public ObjetCeleste getObjetCeleste () {
        return mObjetCeleste;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1D33FC45-9964-9173-EBF2-DB4D61038B2D]
    // </editor-fold> 
    public void setObjetCeleste (ObjetCeleste val) {
        this.mObjetCeleste = val;
    }

}

