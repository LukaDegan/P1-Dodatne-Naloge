import java.util.Scanner;

public class NajblizjiVeckratnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int iskano = a;
        int razlika = Math.abs(b-a);
        for(int i = a; i <= b+a; i+=a) {
            int trenutnaRazlika = Math.abs(b - i);
            if(trenutnaRazlika < razlika) {
                razlika = trenutnaRazlika;
                iskano = i;
            }
        }
        System.out.println(iskano);
    }
}