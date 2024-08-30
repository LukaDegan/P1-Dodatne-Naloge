public class Datum {

    private static final int LETO_MIN = 1583;
    private static final int LETO_MAX = 2999;

    private int dan;
    private int mesec;
    private int leto;

    public Datum(int dan, int mesec, int leto) {
        this.dan = dan;
        this.mesec = mesec;
        this.leto = leto;
    }

    private static boolean jePrestopno(int leto) {
        return (leto % 400 == 0) || ((leto % 4 == 0) && (leto % 100 != 0));
    }

    private static int dolzinaMeseca(int mesec, int leto) {
        if(mesec == 2) {
            if(jePrestopno(leto)) {
                return 29;
            } else {
                return 28;
            }
        } else if(mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11){
            return 30;
        } else {
            return 31;
        }

    }
    private static boolean jeVeljaven(int dan, int mesec, int leto) {
        return (dan > 0 && dan <= dolzinaMeseca(mesec,leto) && mesec > 0 && mesec <= 12 && leto >= LETO_MIN && leto <= LETO_MAX);
    }

    public static Datum ustvari(int dan, int mesec, int leto) {
        if(jeVeljaven(dan, mesec, leto)) {
            return new Datum(dan, mesec, leto);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d.%02d.%d", this.dan, this.mesec, this.leto);
    }

    public boolean jeEnakKot(Datum datum) {
        return this.dan == datum.dan && this.mesec == datum.mesec && this.leto == datum.leto;
    }

    public boolean jePred(Datum datum) {
        return this.leto < datum.leto || (this.mesec < datum.mesec && this.leto == datum.leto) || (this.dan < datum.dan && this.mesec == datum.mesec && this.leto == datum.leto);
    }

    public Datum naslednik() {
        Datum naslednji = new Datum(this.dan + 1, this.mesec, this.leto);
        if(naslednji.jeVeljaven(naslednji.dan, naslednji.mesec, naslednji.leto)) {
            return naslednji;
        } else {
            naslednji = new Datum(1, this.mesec + 1, this.leto);
            if(naslednji.jeVeljaven(naslednji.dan, naslednji.mesec, naslednji.leto)) {
                return naslednji;
            }   else {
                naslednji = new Datum(1, 1, this.leto + 1);
                if(naslednji.jeVeljaven(naslednji.dan, naslednji.mesec, naslednji.leto)) {
                    return naslednji;
                } else {
                    return null;
                }
            }
        }
    }

    public Datum predhodnik() {
        Datum prejsnji = new Datum(this.dan - 1, this.mesec, this.leto);
        if(prejsnji.jeVeljaven(prejsnji.dan, prejsnji.mesec, prejsnji.leto)) {
            return prejsnji;
        } else {
            int stDni = dolzinaMeseca(this.mesec - 1, this.leto);
            prejsnji = new Datum(stDni, this.mesec - 1, this.leto);
            if(prejsnji.jeVeljaven(prejsnji.dan, prejsnji.mesec, prejsnji.leto)) {
                return prejsnji;
            } else {
                prejsnji = new Datum(31, 12, this.leto - 1);
                if(prejsnji.jeVeljaven(prejsnji.dan, prejsnji.mesec, prejsnji.leto)) {
                    return prejsnji;
                } else {
                    return null;
                }
            }
        }
    } 

    public Datum cez(int stDni) {
        Datum novi = new Datum(this.dan, this.mesec, this.leto);
        if(stDni > 0) {
            for(int i = 1; i <= stDni; i++) {
                novi = novi.naslednik();
            }
        } else if(stDni < 0) {
            for(int i = stDni; i < 0; i++) {
                novi = novi.predhodnik();
            }
        }

        return novi;
    }

    public int razlika(Datum datum) {
        
        if(this.jePred(datum)) {
            int razlika = 0;
            Datum kopija = new Datum(this.dan, this.mesec, this.leto);
            while(!(kopija.jeEnakKot(datum))) {
                kopija = kopija.naslednik();
                razlika--;
            }
            return razlika;
        } else {
            int razlika = 0;
            Datum kopija = new Datum(datum.dan, datum.mesec, datum.leto);
            while (!kopija.jeEnakKot(this)) {
                kopija = kopija.naslednik();
                razlika++;
            }
            return razlika;
        }
    }
}