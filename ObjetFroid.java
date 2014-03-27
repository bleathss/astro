package packAstro;

import java.util.ArrayList;


public class ObjetFroid extends ObjetCeleste {

    public int rayonOrbite;
    public int diametre;
    public int periodeRev;
    public int Type;
    public ObjetCeleste mObjetCeleste; /* est satellite de mObjetCeleste ? */

    public ObjetFroid (String nom, int rayonOrbite, int diametre, int period, ObjetCeleste oc) {
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
        return null;
    }
    public ObjetCeleste getObjetCeleste () {
        return mObjetCeleste;
    }

    public void setObjetCeleste (ObjetCeleste val) {
        this.mObjetCeleste = val;
    }

}

