
package Aufgabe2;

import java.util.ArrayList;

public class Webdarstellung extends Beobachter {
     private ArrayList<Artikel> zustandSubjekt;
     private Einkaufsliste subjekt;

    @Override
    void aktualisiere() {
        
        ArrayList<Artikel> temp=subjekt.gibZustand();
        if(temp.size()<zustandSubjekt.size()){
            for (int i = 0; i < zustandSubjekt.size(); i++) {
                if (temp.get(i)!=zustandSubjekt.get(i)) {
                    System.out.println("Folgendes Objekt wurde entfernt: Name:"+zustandSubjekt.get(i).getName()+" Preis: "+zustandSubjekt.get(i).getPreis());
                }
            }
        }
        if(temp.size()>zustandSubjekt.size()){
            System.out.println("Folgendes Objekt wurde hinzugefügt: Name: "+temp.get(temp.size()-1).getName()+" Preis: "+temp.get(temp.size()-1).getPreis());
        }
        zustandSubjekt=temp;
    }
     
     
}
