
package Aufgabe2 ;

import java.util.ArrayList;

public class Rechnung extends Beobachter{

      private ArrayList<Artikel> zustandSubjekt=new ArrayList<Artikel>();
     Einkaufsliste subjekt;
     
    @Override
    void aktualisiere() {
        zustandSubjekt=subjekt.gibZustand();
        int sum=0;
        for (int i = 0; i < zustandSubjekt.size(); i++) {
            sum+=zustandSubjekt.get(i).getPreis();
        }
        System.out.println("Der Gesamtpreis: "+sum);
    }
    
}
