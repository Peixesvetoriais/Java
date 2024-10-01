package switchcaseexercise04;
//@peixes
//Calculadora
import javax.swing.JOptionPane;
public class SwitchCaseExercise04 {

    public static void main(String[] args) {
        //Iniciando às variáveis
        double   n1;
        double   n2;
        double   valor_final = 0;
        int      operacao;
        String   operacao_escrita = "a";
        
        //Breve introdução
        JOptionPane.showMessageDialog(null, "Calculadora");
        
        //Entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        operacao = Integer.parseInt(JOptionPane.showInputDialog("Qual é a operação desejada?" +
                "|(1) Soma" +
                "|(2) Subtração" +
                "|(3) Multiplicação" +
                "|(4) Divisão" +
                "|(5) Resto|"));
        //Seleção Da Operação
        switch (operacao) {
            case 1:
                valor_final = n1 + n2;
                operacao_escrita = "A soma de ";
                break;
            case 2:
                valor_final = n1 - n2;
                operacao_escrita = "A subtração de ";
                break;
            case 3:
                valor_final = n1 * n2;
                operacao_escrita = "A multiplicação de ";
                break;
            case 4:
                valor_final = n1 / n2;
                operacao_escrita = "A divisão de ";
                break;
            case 5:
                valor_final = n1 % n2;
                operacao_escrita = "O resto da divisão de ";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operação inválida.");
                break;
        } 
        int i = (int)(operacao);
        if (i > 0 && i <= 5){
        JOptionPane.showMessageDialog(null, operacao_escrita+n1+ " e "+n2+" é: "+valor_final);
        }
    }
    
}
