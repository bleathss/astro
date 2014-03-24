package packAstro;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.01CE4CC6-E3D8-DD28-9495-1D1355D27B93]
// </editor-fold> 
public class Etoile extends ObjetCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB843676-FA65-FE33-054D-EE8FE9E5C345]
    // </editor-fold> 
    private int magnitude;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.84EFC48A-7A55-0BD1-52AB-F3230A8F15A3]
    // </editor-fold> 
    private char ageLettre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0B61F30E-8527-1691-C072-3AC6FB260518]
    // </editor-fold> 
    private int Type = 0;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5756A2A7-2127-0DEA-DCC8-89A83C9A9635]
    // </editor-fold> 
    public Etoile (String nom, int magnitude, char ageLettre) {
        super(nom, this.Type);
        this.ageLettre = ageLettre;
        this.magnitude = magnitude;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C4DB7ADC-8DCF-2084-DC42-B9D1AD381EC3]
    // </editor-fold> 
    public int getType () {
        return Type;
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
        return null;
    }

}

