package packAstro;

import java.util.ArrayList;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3411E5F7-34A2-8943-5792-786BBB8C06E6]
// </editor-fold> 
public class ObjetFroid extends ObjetCeleste {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ECE1074A-B0A1-13F8-CE46-8E8C7EB6D97B]
    // </editor-fold> 
    private int rayonOrbite;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5496A80A-4946-28AD-CD8E-DC826927022E]
    // </editor-fold> 
    private int diametre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13522718-4B4E-08FF-0C13-04DCA1FB787C]
    // </editor-fold> 
    private int periodeRev;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ABB7221D-F44F-DF16-6A3F-B048CD8EC1F3]
    // </editor-fold> 
    private int Type;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AFA284D5-8414-2CC9-3E11-82B6B7883903]
    // </editor-fold> 
    private ObjetCeleste mObjetCeleste;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.545CF138-CD06-2411-B794-3FDF06588243]
    // </editor-fold> 
    public ObjetFroid () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CE90739C-2222-1298-7069-FB184F149A7E]
    // </editor-fold> 
    public ObjetCeleste getCentre () {
        return mObjetCeleste;
    }
    @Override

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2CEC23EC-7E1D-87E1-A48D-52D0086005F0]
    // </editor-fold> 
    public String toString () {
        return ;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.99B622E8-671D-698F-1942-F5DEB107FBB6]
    // </editor-fold> 
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

