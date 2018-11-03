package Aufgabe1;
public class Osterpaket extends Geschenkpaket{

    @Override
    public Werbegeschenk erzeugeWerbegeschenk() {
        return new Osterhase("Osterhase");
    }

    @Override
    public Gutschein erzeugeGutschein() {
        return new CD(15);
    }
    
}
