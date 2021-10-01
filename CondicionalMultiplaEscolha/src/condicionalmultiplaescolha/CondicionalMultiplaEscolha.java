package condicionalmultiplaescolha;

import java.util.Scanner;


public class CondicionalMultiplaEscolha {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual número de pernas? ");
        int pernas = leitor.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo ="Saci";
                break;
            case 2:
                tipo =" Bípede";
                break;
            case 3:
                tipo = "Trípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
                
            case 6: 
                tipo = "Aranha";
                break;
            default :
                tipo =" ET";
                break;
           
        }
        System.out.println("Isso é um: " + tipo);
    }
    
}
