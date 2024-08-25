import java.util.*;

public class MedianaTrojice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st1 = sc.nextInt();
        int st2 = sc.nextInt();
        int st3 = sc.nextInt();

        int max = max(st1, max(st2, st3));
        int min = min(st1, min(st2, st3));

        int mediana = st1 + st2 + st3 - max - min;
        System.out.println(mediana);        
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}