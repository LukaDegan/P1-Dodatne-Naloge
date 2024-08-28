public class Pismo {

    private Posta izvorna;
    private Posta ciljna;
    private boolean jePriporoceno;
    private int razdalja;

    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja) {
        this.izvorna = izvorna;
        this.ciljna = ciljna;
        this.jePriporoceno = jePriporoceno;
        this.razdalja = razdalja;
    }

    @Override
    public String toString() {
        if(jePriporoceno) {
            return String.format("%s -> %s (%d km) [P]", this.izvorna, this.ciljna, this.razdalja);
        }
        return String.format("%s -> %s (%d km) [N]", this.izvorna, this.ciljna, this.razdalja);
    }

    public boolean izviraOd(Posta posta) {
        return this.izvorna == posta;
    }

    public boolean staIzvorInCiljIsta() {
        return this.izvorna == this.ciljna;
    }

    public boolean imaIstiCiljKot(Pismo pismo) {
        return this.ciljna == pismo.ciljna;
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2) {
        return p1.ciljna == p2.ciljna;
    }

    public int cena() {
        int cena = 0;

        cena = cena + (this.razdalja / r + 1) * c;
        if(this.jePriporoceno) {
            cena += p;
        }
        
        return cena;
    }

    private static int r;
    private static int c;
    private static int p;

    public static void nastaviKonstanteZaCeno(int enotaRazdalje, int enotaCene, int priporocnina) {
        r = enotaRazdalje;
        c = enotaCene;
        p = priporocnina;
    }

    public boolean jeDrazjeOd(Pismo pismo) {
        return this.cena() > pismo.cena();
    }

    public static Pismo vrniDrazje(Pismo p1, Pismo p2) {
        if(p1.cena() > p2.cena()) {
            return p1;
        }
        return p2;
    }

    public Pismo izdelajPovratno() {
        return new Pismo(this.ciljna, this.izvorna, this.jePriporoceno, this.razdalja);
    }
}