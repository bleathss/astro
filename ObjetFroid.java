package packAstro;

import java.util.ArrayList;


public class ObjetFroid extends ObjetCeleste {

    private int rayonOrbite;
    private int diametre;
    private int periodeRev;
    private int Type;
    private ObjetCeleste mObjetCeleste; /* est satellite de mObjetCeleste ? */

    public ObjetFroid (String nom, int rayonOribte, int diametre, int period, ObjetCeleste oc) {
        super(nom, 1);
        this.diametre = diametre;
        this.rayonOribte = rayonOribte;
        this.periodeRev = period;
        this.mObjetCeleste = oc;
    }
    public ObjetCeleste getCentre () {
        return mObjetCeleste;
    }
    
    @Override
    public String toString () {
        return ;
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

