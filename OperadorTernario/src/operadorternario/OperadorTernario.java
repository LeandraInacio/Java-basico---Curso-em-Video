
package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        
        int r = (n1>n2)? n1:n2;
        
        System.out.println("o número maior é: "+ r);
        
    }
    
}
