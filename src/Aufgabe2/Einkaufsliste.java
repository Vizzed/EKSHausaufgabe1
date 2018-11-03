
package Aufgabe2;

import java.util.ArrayList;

public class Einkaufsliste extends Subjekt {
   private ArrayList<Artikel> zustand;
   
   Einkaufsliste(){
       zustand=new ArrayList<Artikel>();
   }
   public ArrayList<Artikel> gibZustand(){
       return zustand;
   }
   public void addArtikel(Artikel a){
       zustand.add(a);
   }
   
   public void entferneArtikel(Artikel a){
       zustand.remove(a);
   }
}
