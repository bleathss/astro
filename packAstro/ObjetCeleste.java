package packAstro;

import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.43032C9B-B031-8187-89A2-10595DC15AAA]
// </editor-fold> 
public abstract class ObjetCeleste {

    public ArrayList<ObjetCeleste> mSatellites;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3CB74937-0275-3274-3C9B-20B1686AE2CE]
    // </editor-fold> 
    public int id;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D442F145-ACB6-9135-9A7D-D17A4D299F78]
    // </editor-fold> 
    public String nom;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C6CF6014-4F6B-EBA1-ED4A-D26CCD90237F]
    // </editor-fold> 
    public int Type;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F5CEE911-2115-36A7-289B-7ED743BC9E72]
    // </editor-fold> 
    public ObjetCeleste (String nom, int Type) {
        this.nom = nom;
        this.Type = Type;
        this.id = Univers.IncrementeId();
        /* Not sure if this is needed!!!*/
        this.mSatellites = new ArrayList<>();
    }
    public void addSatellite(ObjetCeleste oc)
    {
        if(oc.Type == 1)
        {
            this.mSatellites.add(oc);
        }
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73F730F2-66A0-9E73-516D-A8280B5645ED]
    // </editor-fold> 
    public static ObjetCeleste s_getObjet (int num) {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.58BBFCEA-A740-4BCD-065C-22AE7DEC160A]
    // </editor-fold> 
    public String getType () {
        if (this.Type ==1)
            return "Etoile";
        if (this.Type ==2)
            return "Planete";
        if (this.Type ==3)
            return "Planete naine";
        if (this.Type ==4)
            return "ExoPlanete";
        if (this.Type ==4)
            return "Lune";
        return "";
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2CBCF7BD-9DFC-DA8C-7A8B-7D0805427F53]
    // </editor-fold> 
    public Galaxie getGalaxie () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.04376E58-A7E1-50A3-F0E9-1EC46BD212DE]
    // </editor-fold> 
    public int nbDeSatellites () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.59FE21B9-7859-1C14-4333-AB9E508D6ADF]
    // </editor-fold> 
    public ArrayList<ObjetFroid> getSatellites () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.53C2368F-F7BF-6AF2-691C-1A130518DB88]
    // </editor-fold> 
    public void setType (int val) {
        this.Type = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B6B79EBD-C473-D7E1-9742-9AC5B0BE5B49]
    // </editor-fold>
    @Override 
    public int getType () {
        return Type;
    }

}

