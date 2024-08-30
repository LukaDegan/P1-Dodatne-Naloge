import java.util.*;

public class SahovskiTurnir {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] tockeIgralcev = new int[n][2];
        for(int i = 0; i < tockeIgralcev.length; i++) {
            tockeIgralcev[i][0] = i+1;
        }

        while(sc.hasNextInt()) {
            int beli = sc.nextInt();
            int crni = sc.nextInt();
            int izid = sc.nextInt();
            switch(izid) {
                case 1:
                    tockeIgralcev[beli-1][1] += 2;
                    break;
                case 0:
                    tockeIgralcev[beli-1][1]++;
                    tockeIgralcev[crni-1][1]++;
                    break;
                case -1:
                    tockeIgralcev[crni-1][1] += 2;
                    break;
            }
        }

        for(int i = 0; i < tockeIgralcev.length - 1; i++) {
            if(tockeIgralcev[i][1] < tockeIgralcev[i+1][1]) {
                int[] tmp = tockeIgralcev[i+1];
                tockeIgralcev[i+1] = tockeIgralcev[i];
                tockeIgralcev[i] = tmp;
                i = -1;
            }
        }

        for(int i = 0; i < tockeIgralcev.length; i++) {
            System.out.printf("%d %d\n",tockeIgralcev[i][0],tockeIgralcev[i][1]);            
        }
    }
}