package monnaie;


public  class  Monnaie {

    public int nbrpieceor;
    public int nbrpieceargent;
    public int nbrpiececuivre;

    public Monnaie (){
        this.nbrpieceargent=0;
        this.nbrpieceor=0;
        this.nbrpiececuivre=0;
    }
    public Monnaie(int x,int z,int y){
        this.nbrpieceargent=x;
        this.nbrpieceor=y;
        this.nbrpiececuivre=z;
    }

    public static Monnaie ZERO=new Monnaie();

    public String tostring(){
        return nbrpieceor+"o"+nbrpieceargent+"a"+nbrpiececuivre+"c";
    }
    public monnaie.Monnaie ajoute(int r, Piece type){
        if(type ==Piece.ARGENT){return new Monnaie(nbrpieceargent+r,nbrpieceor,nbrpiececuivre);}
        if(type ==Piece.OR){return new Monnaie(nbrpieceargent,nbrpieceor+r,nbrpiececuivre);}
        if(type ==Piece.CUIVRE){return new Monnaie(nbrpieceargent,nbrpieceor,nbrpiececuivre+r);}
        return null;
    }
 public monnaie.Monnaie plus(Monnaie m){
     return new Monnaie(nbrpieceargent+m.nbrpieceargent,nbrpieceor+m.nbrpieceor,nbrpiececuivre+ m.nbrpiececuivre);
 }
 public int get (Piece type){
     if(type ==Piece.ARGENT){return nbrpieceargent;}
     if(type ==Piece.OR){return nbrpieceor;}
     if(type ==Piece.CUIVRE){return  nbrpiececuivre;}
     return 0;
  }



}

