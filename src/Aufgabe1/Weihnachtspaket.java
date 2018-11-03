package Aufgabe1;
public class Weihnachtspaket extends Geschenkpaket {
    
    @Override
    public Werbegeschenk erzeugeWerbegeschenk() {
        return new Weihnachtsmann("Weihnachtsmann");
    }

    @Override
    public Gutschein erzeugeGutschein() {
        return new CD(20);
    }
    
}
