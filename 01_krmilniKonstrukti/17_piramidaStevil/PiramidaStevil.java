import java.util.Scanner;

public class PiramidaStevil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            
            int stevilo = i % 10;
            
            for(int k = 0; k < i*2 - 1; k++) {
                System.out.print(stevilo);
                stevilo++;
                stevilo %= 10;
            }
            
            System.out.println();
        }
    }
}