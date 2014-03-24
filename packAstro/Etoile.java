package packAstro;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.01CE4CC6-E3D8-DD28-9495-1D1355D27B93]
// </editor-fold> 
public class Etoile extends ObjetCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB843676-FA65-FE33-054D-EE8FE9E5C345]
    // </editor-fold> 
    public int magnitude;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.84EFC48A-7A55-0BD1-52AB-F3230A8F15A3]
    // </editor-fold> 
    public char ageLettre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0B61F30E-8527-1691-C072-3AC6FB260518]
    // </editor-fold> 
    public static int Type = 0;
    public Galaxie g;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5756A2A7-2127-0DEA-DCC8-89A83C9A9635]
    // </editor-fold> 
    public Etoile (String nom, int magnitude, char ageLettre, Galaxie g) {
        super(nom, 0);
        this.ageLettre = ageLettre;
        this.magnitude = magnitude;
        this.g = g;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2B92B97F-896B-0DAB-7DA6-764F70C20E84]
    // </editor-fold> 
    public void setType (int val) {
        this.Type = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5802761B-8177-359A-DC10-D0FAF890DB9C]
    // </editor-fold> 
    public String toString () {
        return this.id + "- << " + this.nom + " >> : Etoile ; Galaxie : " + this.g.nom + " : age " + this.ageLettre + " : " + this.mSatellites.size() + " Satellite(s)";
    }

}

