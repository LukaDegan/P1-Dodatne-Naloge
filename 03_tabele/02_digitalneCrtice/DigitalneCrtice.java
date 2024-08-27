import java.util.Scanner;

public class DigitalneCrtice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] t = new int[n];
        for(int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }

        int[] crtice = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int maxStevilo = -1;
        int maxCrtic = -1;

        for(int i = 0; i < t.length; i++) {
            
            String stevilo = String.valueOf(t[i]); // stevilo damo v string da lahko uporabljamo metode za stringe
            int stCrtic = 0;
            
            for(int j = 0; j < stevilo.length(); j++) { // length() metoda za stringe 
                int stevka = stevilo.charAt(j) - '0'; // najdemo crko na poz j in odstejemo '0' da pride iz char v int
                stCrtic += crtice[stevka];
            }

            if(stCrtic > maxCrtic) {
                maxCrtic = stCrtic;
                maxStevilo = t[i];
            }
        }

        System.out.println(maxStevilo);
    }
}