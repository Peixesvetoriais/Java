package descontosdepreços;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class DescontosDePreços {

    
    public static void main(String[] args) {
        
            JOptionPane.showMessageDialog(null, "Descontos de Preços");
		
	    //começando às variaveis
	    String compra;
	    double valor_total;
            double desconto;
            double valor_arredondado;
            int    desconto_inteiro;
            DecimalFormat deci = new DecimalFormat("0.00");

	    //entrada do valor da compra e conversão da variavel
	    compra = JOptionPane.showInputDialog("Digite o valor da sua compra");
	    valor_total = Double.parseDouble(compra);
            
            //valor inicial do desconto
            desconto = 5;
	   
            //Adiciona mais 5 a cada aumente de valor
            if (valor_total >= 200) {  
               desconto += 5;
            
            }
            if (valor_total >= 300) {
                desconto += 5;
              
            }
            
            
            //Pega o valor da compra e subtrai pelo desconto
            valor_total *= (1 - (desconto / 100));
            desconto_inteiro = (int)desconto;
            JOptionPane.showMessageDialog(null, "O valor total da compra com desconto de " + desconto_inteiro + "% é: RS" + deci.format(valor_total));
    }
    
}
