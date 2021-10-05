package testefuncao01;


public class TesteFuncao01 {

    
    static void soma (int a,int b){
        int s= a+b;
        System.out.println("Soma é: "+s);
    }
    
    static int funcao (int c, int d){
        int r = c+d;
        return r;
    }    
    public static void main(String[] args) {
        soma(5,2);
        int sm = funcao(7,8);
        
        System.out.println("O retorno da função é : "+sm);
    }
    
}
