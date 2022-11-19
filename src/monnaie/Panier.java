package monnaie;

import java.util.ArrayList;
public class Panier {
    ArrayList<Object> Panier;
      public int numero;

    public Panier(){
        this.Panier=new ArrayList<>();
        numero++;
    }
    public void ajoute(Bouteille b){
        Panier.add(b);
    }
    public void ajoute(Couteau c){
        Panier.add(c);
    }
    public boolean estVide(){
       return Panier.isEmpty();
    }


    public Object dernier (){
        if (Panier.isEmpty() == !true){
            Object last = Panier.get(Panier.size() - 1);
            return  last;}
        return null;
    }
    public  Object afficherelement(){
        for(int i = 0 ; i < Panier.size(); i++){
            if (Object instanceof Bouteille){}
        }



    }


    public String tostring(){
         return "panier"+numero="("+Panier.size()+")"+


         }






}
