import java.util.*;

public class MnozenjeSSestevanjem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st1 = sc.nextInt();
        int st2 = sc.nextInt();

        System.out.println(mnozenje(st1,st2));
    }

    public static int mnozenje(int a, int b) {
        int rez = 0;
        for(int i = 1; i <= b; i++) {
            rez += a;
        }
        return rez;
    }
}