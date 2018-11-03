package Aufgabe2;

public class Klient {

    public static void main(String[] args) {
        Subjekt eListe = new Einkaufsliste();
        Beobachter b1 = new Webdarstellung();
        Beobachter b2 = new Rechnung();
       
       //eListe.meldeAn(b1);
        eListe.meldeAn(b2);
        Artikel cd3=new CD();
        cd3.setName("CD3");
        cd3.setPreis(25);
        //eListe.addArtikel(cd3);
        eListe.benachrichtige();
        
    }
    
   

}
