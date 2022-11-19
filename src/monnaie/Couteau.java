package monnaie;

public class Couteau {
    public String nom;
    public Monnaie prix;
    public boolean taille ;

    public Couteau(String n,Monnaie p ,boolean t){
        this.nom=n;
        this.prix=p;
        this.taille=t;
    }
    public String tostring(){
        if (taille==true){return "couteaux" +this.nom+"("+prix.nbrpieceor+"o"+prix.nbrpieceargent+"a"+prix.nbrpiececuivre+"c"+")";}
        else {return "petit"+"couteaux" +this.nom+"("+prix.nbrpieceor+"o"+prix.nbrpieceargent+"a"+prix.nbrpiececuivre+"c"+")";}
    }
    public int getpriceor(){
        return prix.nbrpieceor;
    }




}
