import java.util.*;

public class VsiRazlicni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];

        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        boolean razlicni = true;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < t.length; i++) {
            for(int j = i + 1; j < t.length; j++) {
                if(t[i] == t[j]) {
                    razlicni = false;
                    if(t[i] < min) {
                        min = t[i];
                    }
                    break;
                }
            }
        }

        if(razlicni) {
            System.out.println("RAZLICNI");
        } else {
            System.out.println(min);
        }
    }
}