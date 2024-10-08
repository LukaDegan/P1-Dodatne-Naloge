public class Posta {

    private int stevilka;
    private String naziv;

    public Posta(int stevilka, String naziv) {
        this.stevilka = stevilka;
        this.naziv = naziv;
    }

    public int vrniStevilko() {
        return this.stevilka;
    }

    public String vrniNaziv() {
        return this.naziv;
    }

    @Override
    public String toString() {
        return String.format("%d %s", this.stevilka, this.naziv);
    }
}