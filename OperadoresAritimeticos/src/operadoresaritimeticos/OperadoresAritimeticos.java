package operadoresaritimeticos;

import java.util.Scanner;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
    // Cálculo da divisão de dois números     
    /*    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número:  ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número:  ");
        int n2 = teclado.nextInt();
        float media=(n1+n2)/2;
        System.out.println(" A média entre os números é: "+ media);
    // avaliação de pré e pós incremento    
        int preincremento = n1+ ++n1;
        int posincremento = n2 + n2++;
        System.out.println("Pré incremento é :" + preincremento);
        System.out.println("Pós incremento é :" + posincremento);
    // utilização de incrementos e atribuição     
        int x=2;
        x+=4; // temos também *= ;-=; /*;
        System.out.println(x);
         
    // utilização da classe Math
        int inteiro = 25;
        int raiz = (int) Math.sqrt(inteiro);
        System.out.println("A raiz de 25 é : "+ raiz);*/
    
     // Arredondamento
        float teste = (float) 3.6;
        int arredondamentobaixo = (int)Math.floor(teste);
        int arredondamentocima = (int)Math.ceil(teste);
        System.out.println("os arredondamentos para baixo é : "+ arredondamentobaixo);
        System.out.println("os arredondamentos para cima é : "+ arredondamentocima);
    }
    
}
