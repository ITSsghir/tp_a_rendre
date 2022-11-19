package monnaie;

public class Bouteille {
    public String nom;
    public Monnaie prix;
public Bouteille(String n,Monnaie p ){
    this.nom=n;
    this.prix=p;
}
public String tostring (){
    return "Bouteille"+nom+"("+ prix.nbrpieceor+"o"+ prix.nbrpieceargent+"a"+prix.nbrpiececuivre+"c"+")";
}


}
