import java.util.Scanner;

public class StevilskaZaporedja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if(a <= b && k > 0) {
            for(int i = a; i <= b; i+=k) {
                System.out.println(i);
            }
        } else if(a >= b && k < 0) {
            for(int i = a; i >= b; i+=k) {
                System.out.println(i);
            }
        } else {
            System.out.println("NAPAKA");
        }
    }
}