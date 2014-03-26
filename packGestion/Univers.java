package packGestion;
import java.util.ArrayList; 
import packAstro.Galaxie; 
import packAstro.ObjetCeleste; 
import packAstro.ObjetFroid; 
import packAstro.Etoile; 


public class Univers {

    private static int nextId = 0;
    public ArrayList<Galaxie> mGalaxie;

    public int getNextId()
    {
        return this.nextId;
    }

    private Univers () {
        this.mGalaxie = new ArrayList<>();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.336037AB-1648-F410-1F87-FACAD64ADE03]
    // </editor-fold> 
    public static Univers getUnivers () {
        return new Univers();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8E9C2D94-5834-FF38-CBB0-66D08E110AFD]
    // </editor-fold> 
    public static int IncrementeId () {
        nextId++;
        return nextId;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D9765C59-3662-EB16-E0A4-863B423E9272]
    // </editor-fold> 
    public void creerGalaxie (String nom, String type, int eloignement) {
        this.mGalaxie.add(new Galaxie(nom, type, eloignement));
        System.out.println("Galaxie cree");
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A844FA8F-059C-D823-F7E6-F77B0696643E]
    // </editor-fold> 
    public ArrayList<Galaxie> getTtesGalaxies () {
        return this.mGalaxie;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CEACB420-37B6-0F4E-6F65-AC4A427799FE]
    // </editor-fold> 
    public Galaxie getGalaxie (String nom) {
        /* On suppose que la galaxy du nom existe -- sinon ca lance une erreure vraiment pourris */
        Galaxie g = null;
        for(Galaxie h : this.mGalaxie)
        {

            if(h.nom == nom)
            {
                g = h;
            }
        }
        return g;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.47CA4E46-B492-C3C9-5242-9E1FD2046228]
    // </editor-fold> 
    public ObjetFroid theBigOne () {
        ObjetFroid big = null;
        for(Galaxie temp_g : mGalaxie)
        {
            for(Etoile temp_e : temp_g.mEtoile)
            {
                for(ObjetCeleste temp_o : temp_e.mSatellites)
                {
                    if (temp_o instanceof ObjetFroid )
                    {
                        ObjetFroid temp_of = (ObjetFroid)temp_o;
                        big = (big == null || big.diametre < temp_of.diametre) ? temp_of : big;
                    }
                }
            }
        }
        return big;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A9772CBB-C3DC-38FA-D9D8-C8A9BDF2BC5E]
    // </editor-fold> 
    public int nbDetoiles () {
        int total = 0;
        for(Galaxie g: this.mGalaxie)
        {
            total += g.ListeEtoiles().size();
        }
        return total;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7544978A-8533-AC43-7CC8-8BA85AD6BFCB]
    // </editor-fold> 
    public void creerEtoile (String nom, int magnitude, char age_lettre, Galaxie g) {
        Etoile e = new Etoile(nom, magnitude, age_lettre,g);
        g.mEtoile.add(e);
        System.out.println("ajout d'etoile : " +g.mEtoile);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.44481300-AA16-3883-565D-5F063023C981]
    // </editor-fold> 
    public void creerObjetFroid (String nom, int rayonOrbite, int diametre, int period, ObjetCeleste oc) {
        oc.mSatellites.add(new ObjetFroid(nom, rayonOrbite, diametre, period, oc));
         System.out.println("ajout d'objet froid : " +oc.mSatellites);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F3836C8C-40AA-013D-A4BA-F22198BECB1F]
    // </editor-fold> 
    public ObjetCeleste getObjet(int num)
    {
        ObjetCeleste res = null;
        for(Galaxie g : mGalaxie)
        {
            for(ObjetCeleste h : g.ListeEtoiles())
            {
                if (h.id == num)
                {
                    res = h;
                }
                for (ObjetCeleste i : h.getSatellites() ) {
                    if (i.id == num)
                    {
                        res = h;
                    }  
                    for (ObjetCeleste j : i.getSatellites() ) {
                        if (j.id == num)
                        {
                            res = h;
                        }  
                    }
                }
            }
        }
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5F50C91B-A96E-3C2B-53E2-7CB3B04A24A1]
    // </editor-fold> 
    public ArrayList<ObjetCeleste> getObjets(Galaxie g) {
        ArrayList<ObjetCeleste> res = new ArrayList<ObjetCeleste>();
        for(ObjetCeleste h : g.mEtoile)
        {
                res.add(h);
            for (ObjetCeleste i : h.mSatellites ) {
                res.add(i);
            }
        }
        return res;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A1B2C780-3921-F88E-798F-F4C1EF9D6130]
    // </editor-fold> 
    public ArrayList<Galaxie> getGalaxie() {
        return mGalaxie;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B789DC31-BFE2-795A-AFA7-35E304EDB3FF]
    // </editor-fold> 
    public void setGalaxie (ArrayList<Galaxie> val) {
        this.mGalaxie = val;
    }

}

