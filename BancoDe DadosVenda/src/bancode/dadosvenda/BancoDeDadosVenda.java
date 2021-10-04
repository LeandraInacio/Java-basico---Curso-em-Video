package bancode.dadosvenda;

import javax.swing.JOptionPane;

public class BancoDeDadosVenda {

    public static void main(String[] args) {
        String nome, sexo,cidade;
        int idade = 0, valor=0, item=1,soma=0;
        
        nome = JOptionPane.showInputDialog(null, "Informe o nome do Cliente");
        sexo= JOptionPane.showInputDialog(null, "Informe o sexo do Cliente");
        cidade = JOptionPane.showInputDialog(null, "Informe a cidade do Cliente");
        idade = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Informe a idade do Cliente"));
        
        do{
            valor= Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Informe o valor do item : "+ item+
                            "(valor = 0 finaliza a gravação)"));
            item++;
            soma+=valor;
            
        }while (valor!=0);        
        
        JOptionPane.showMessageDialog(null, "<html>Nome : "+ nome +"<br> Sexo: "
                + sexo + "<br>Cidade : "+ cidade + "<br> Idade : "+ idade +
                " <br>Valor total da compra" + soma +"</html>");
    }
    
}
