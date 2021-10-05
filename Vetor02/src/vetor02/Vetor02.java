package vetor02;

import java.util.Arrays;

public class Vetor02 {

    public static void main(String[] args) {
        String mes[]= {"jan", "Fev","Mar","Abr","Maio","Jun","Jul","Agost",
            "Set","Out","Nov","Dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int posicao = Arrays.binarySearch(mes,"Jun");
        System.out.println(posicao);
        
        for(int c=0; c< mes.length;c++){
            System.out.println("o mês de " + mes[c]+" tem "+dias[c]+" dias.");
        }
    
        int num[]={2,5,8,6};
        Arrays.sort(num);
        for(int valor:num){
            System.out.print(valor+ " ");
        }
        

    }
    
}
