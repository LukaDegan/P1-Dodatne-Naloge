import java.util.*;

public class IgorjeviBloki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b,c));
        
        for(int i = 1; i <= max; i++) {
            
            // blok1
            if(i <= a) {
                for(int b1 = 0; b1 < a; b1++) {
                    System.out.print(a);
                }
            } else { 
                for(int b1 = 0; b1 < a; b1++) {
                    System.out.print(" ");
                }
            }
            if((i <= b) || (i <= c)) {
                System.out.print(" "); // presledek med bloki
            }
        
            // blok2
            if(i <= b) {
                for(int b2 = 0; b2 < b; b2++) {
                    System.out.print(b);
                }
            } else if(b < c) { // da dela tud pr a > b > c
                for(int b2 = 0; b2 < b; b2++) {
                    System.out.print(" ");
                }
            }
            if(i <= c) {
                System.out.print(" "); // presledek med bloki
            }

            // blok3
            if(i <= c) {
                for(int b3 = 0; b3 < c; b3++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}