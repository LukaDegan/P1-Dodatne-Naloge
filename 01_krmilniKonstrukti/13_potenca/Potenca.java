import java.util.Scanner;

public class Potenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rez = 1;
        
        for(int i = 1; i <= b; i++) {
            rez *= a;
        }
        System.out.println(rez);
    }
}