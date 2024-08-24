import java.util.Scanner;

public class Trihotomija {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int prvo = sc.nextInt();
        int drugo = sc.nextInt();

        if(prvo > drugo) {
            System.out.println(1);
        } else if (prvo == drugo) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}