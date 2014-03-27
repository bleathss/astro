package packAstro;
import java.util.ArrayList;

public class ObjetFroid extends ObjetCeleste {

    public int rayonOrbite;
    public int diametre;
    public int periodeRev;
    public ObjetCeleste mObjetCeleste; /* est satellite de mObjetCeleste ? */

    //Types :
    //0 : etoile
    //1 : planete >6.000km + satellite du soleil
    //2 : planete naine < 6.000km + satellite du soleil
    //3 : exoplanete satellite d'une étoile différente du soleil
    //4 : lune :satellite d'un objet different d'une etoile (ex : lune)

    public ObjetFroid (String nom, int rayonOrbite, int diametre, int period, ObjetCeleste oc) {
        super(nom, 0);

        this.mObjetCeleste = oc;
        this.diametre = diametre;
        this.rayonOrbite = rayonOrbite;
        this.periodeRev = period;
        this.Type = this.setType();
    }
    public int setType()
    {
        int temp = 4;
        if(this.mObjetCeleste.nom == "Soleil")
        {
            if(this.diametre > 6000)
            {
                temp = 1;
            }
            else
            {
                temp = 2;
            }

        }
        else if(this.mObjetCeleste.Type == 0)
        {
            temp = 3;
        }
        return temp;
    }
    public ObjetCeleste getCentre () {
        return mObjetCeleste;
    }
    @Override
    public String toString () {
        return this.id + "- << " + this.nom + " >> : "+ this.getType() +" ; Galaxie : " 
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

