
package Aufgabe2;

import java.util.ArrayList;

public abstract class Subjekt {
    private ArrayList<Beobachter> bListe;
    
    Subjekt(){
        bListe=new ArrayList<Beobachter>();
    }
    
  void meldeAn(Beobachter b){bListe.add(b);}
  void meldeAb(Beobachter b){bListe.remove(b);}
  void benachrichtige(){
      for (int i = 0; i < bListe.size(); i++) {
          bListe.get(i).aktualisiere();
      }
  }
  
  
}
