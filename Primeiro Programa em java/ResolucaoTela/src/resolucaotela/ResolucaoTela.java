package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tamanhotela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A resolução da tela é : "+ tamanhotela.toString());
    }
    
}
