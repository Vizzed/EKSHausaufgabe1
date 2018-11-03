package Aufgabe1;

public class Familienpaket extends Geschenkpaket {

    @Override
    public Werbegeschenk erzeugeWerbegeschenk() {
        return new Fussball("Fussball");
    }

    @Override
    public Gutschein erzeugeGutschein() {
        return new DVD(25);
    }
    
}
