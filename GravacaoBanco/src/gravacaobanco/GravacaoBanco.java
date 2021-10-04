package gravacaobanco;

import javax.swing.JOptionPane;

public class GravacaoBanco {

    public static void main(String[] args) {
        int n,s=0;
        do{
           n= Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um número"
                   + " : <br><em>(valor 0 interrompe)</em></html>")); 
           s+=n;
        }while(n!=0);
        JOptionPane.showMessageDialog(null," Valor do somatório é : "+ s);
    }
    
}
