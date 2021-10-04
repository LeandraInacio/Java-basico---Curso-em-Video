package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n, s =0;
        String resp;
        Scanner leitor = new Scanner(System.in);
        
        do{
            System.out.print("Digite um número :");
            n= leitor.nextInt();
            s+=n; //s=s+n
            
            System.out.print("Quer continuar? ");
            
            resp=leitor.next();
            
        }while (resp.equals("S"));
        
        System.out.print("A soma de todos os valores é: "+s);
    }
    
}
