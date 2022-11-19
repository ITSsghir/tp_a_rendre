package monnaie;

public enum Piece {
    OR("OR"), ARGENT("ARGENT"), CUIVRE("CUIVRE");
    public static final String TOUTES ="[OR, ARGENT, CUIVRE]" ;
    public static int NOMBRE=3;
    private  String name;

     Piece(String name) {
        this.name=name;
    }
    public String tostring(){
        return this.name();
    }

}
