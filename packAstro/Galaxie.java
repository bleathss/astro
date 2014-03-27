package packAstro;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.74CF5448-D76E-6A08-B021-272428E9BE9E]
// </editor-fold> 
public class Galaxie {

    public ArrayList<Etoile> mEtoile;
    public String nom;
    public String type;
    public int eloignement;

    public Galaxie (String nom, String type, int eloignement) {
        this.nom = nom;
        this.type = type;
        this.eloignement = eloignement;
        mEtoile = new ArrayList<>();
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.06EEFD39-C3ED-8A84-E038-D2AF7DD7FD4F]
    // </editor-fold> 
    public ArrayList<Etoile> ListeEtoiles () {
        return this.mEtoile;
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.51EAA614-C4CC-2DB5-8A56-82C5BFC7E25B]
    // </editor-fold> 
    public void addEtoile (Etoile val) {
        this.mEtoile.add(val);
    }
    public String toString()
    {
        return "nom : "+this.nom+"; Type : "+this.type+"; Eloignement : "+this.eloignement+" Etoiles : "+ this.mEtoile.size();
    }

}

