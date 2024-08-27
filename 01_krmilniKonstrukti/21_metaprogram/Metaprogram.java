import java.util.*;

public class Metaprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("public class Nizi {");
        System.out.println("    public static void main(String[] args) {");
        
        // izpis for zank
        int presledki = 8;
        for(int i = 1; i <= n;i++) { 
            for(int j = 0; j < presledki; j++) {
                System.out.print(" ");
            }
            System.out.printf("for (char c%d = 'A';  c%d <= 'Z';  c%d++) {\n", i, i, i); 
            presledki += 4;       
        }
        
        // izpis system.out.print
        for(int j = 0; j < presledki; j++) {
            System.out.print(" ");
        }
        System.out.printf("System.out.println(\"\"");
        for(int i = 1; i <= n; i++) {
            System.out.printf(" + c%d", i);
        }
        System.out.printf(");\n");

        // izpis }
        presledki -= 4;
        for(int i = 1; i <= n;i++) { 
            for(int j = 0; j < presledki; j++) {
                System.out.print(" ");
            }
            System.out.println("}"); 
            presledki -= 4;       
        }
        
        System.out.println("    }");
        System.out.println("}");
    }
}