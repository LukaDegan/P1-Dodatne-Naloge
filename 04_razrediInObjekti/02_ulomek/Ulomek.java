public class Ulomek {
    
    private int a;
    private int b;

    public Ulomek(int a, int b) {
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;

        if ((b < 0 && a > 0) || (a < 0 && b < 0)) { // ce a/-b alpa -a/-b
            a *= -1;
            b *= -1; 
        } 

        this.a = a;
        this.b = b;
    }

    private int gcd(int a, int b) { //copy paste
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private int lcm(int st1, int st2) {
        return Math.abs(st1 * st2) / gcd(st1, st2); // copy paste
    }

    public String toString() {
        return String.format("%d/%d", this.a, this.b);
    }

    public boolean jeEnakKot(Ulomek u) {
        return this.a == u.a && this.b == u.b;
    }

    public Ulomek negacija() {
        return new Ulomek(-this.a, this.b);
    }

    public Ulomek obrat() {
        return new Ulomek(this.b, this.a);
    }

    public Ulomek vsota(Ulomek u) {
        return new Ulomek(a*(lcm(this.b,u.b)/b) + u.a*(lcm(this.b,u.b)/u.b), lcm(this.b,u.b));
    }

    public Ulomek razlika(Ulomek u) {
        return new Ulomek(a*(lcm(this.b,u.b)/b) - u.a*(lcm(this.b,u.b)/u.b), lcm(this.b,u.b));
    }

    public Ulomek zmnozek(Ulomek u) {
        return new Ulomek(this.a * u.a, this.b * u.b);
    }

    public Ulomek kolicnik(Ulomek u) {
        return new Ulomek(this.a * u.b, this.b * u.a);
    }

    public Ulomek potenca(int eksponent) {
        int p = 1;
        int q = 1;
        if(eksponent > 0) {
            for(int i = 1; i <= eksponent; i++) {
                p *= this.a;
                q *= this.b; 
            }
            return new Ulomek(p,q);
        } else {
            eksponent *= -1;
            for(int i = 1; i <= eksponent; i++) {
                p *= this.a;
                q *= this.b; 
            }
            return new Ulomek(q,p);
        }
    }

    public boolean jeManjsiOd(Ulomek u) {
        return this.a * u.b < u.a * this.b;
    }
}