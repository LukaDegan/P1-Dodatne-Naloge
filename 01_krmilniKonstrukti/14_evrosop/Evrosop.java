import java.util.Scanner;

public class Evrosop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int blagajna = 0;
        int stEnk = 0;
        int stDvojk = 0;
        boolean bankrot = false;

        while(sc.hasNextInt() && !bankrot) {
            int kovanec = sc.nextInt();
            if(kovanec == 2) {
                if(blagajna == 0) {
                    bankrot = true;
                    break;
                }
                stDvojk++;
                blagajna--;
                stEnk--;
            } else {
                blagajna++;
                stEnk++;
            } 
        }

        if(bankrot) {
            System.out.println("BANKROT");
        } else {
            System.out.println(stEnk);
            System.out.println(stDvojk);
        }
    }
}