import java.util.*;

public class Sahovnica {
    
    public static void rob(int d, int s) {
        System.out.print("+ ");
        for(int i = 0 ; i < s*d; i++) {
            System.out.print("- ");
        }
        System.out.println("+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
    
    	rob(d,s);        
        for(int i = 1; i <= v; i++) {
            for(int ii = 1; ii <= d; ii++) {
                for(int j = 1; j <= s; j++) {
                    if(j == 1) {
                        System.out.print("| ");
                    }
                    if(i % 2 == 1) {
                        if(j % 2 == 1) {
                            for(int k = 0; k < d; k++) {
                                System.out.print("  ");
                            }
                        } else {
                            for(int k = 0; k < d; k++) {
                                System.out.print("* ");
                            }
                        }
                    } else {
                        if(j % 2 == 1) {
                            for(int k = 0; k < d; k++) {
                                System.out.print("* ");
                            }
                        } else {
                            for(int k = 0; k < d; k++) {
                                System.out.print("  ");
                            }
                        }
                    }
                    if(j == s) {
                        System.out.println("|");
                    }
                }
            }
        }
        rob(d,s);
    
        
        /*
        // isti program sam da ma namest ii loopa mau cudno racunanje 

        rob(d,s);        
        for(int i = 1; i <= v*d; i++) {
            for(int j = 1; j <= s; j++) {
                if(j == 1) {
                    System.out.print("| ");
                }

                if(((i-1)/d) % 2 == 1) { // here
                    if(j % 2 == 1) {
                        for(int k = 0; k < d; k++) {
                            System.out.print("* ");
                        }
                    } else {
                        for(int k = 0; k < d; k++) {
                            System.out.print("  ");
                        }
                    }
                } else {
                    if(j % 2 == 1) {
                        for(int k = 0; k < d; k++) {
                            System.out.print("  ");
                        }
                    } else {
                        for(int k = 0; k < d; k++) {
                            System.out.print("* ");
                        }
                    }
                }
                if(j == s) {
                    System.out.println("|");
                }
            }
        }
        rob(d,s);
        */
    }
}