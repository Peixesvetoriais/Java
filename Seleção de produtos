package switchcaseexercise01;
//@Peixes
//Teste de Switch Case
import javax.swing.JOptionPane;

public class SwitchCaseExercise01 {
    
    public static void main(String[] args) {
        //Iniciando variáveis
        int     produto;
        String  produto_final;
        
        //Breve Descrição do exercício
        JOptionPane.showMessageDialog(null, "Seleção de produtos");
        
        //Entrada do valor do produto
        produto = Integer.parseInt(JOptionPane.showInputDialog("Qual é o código do produto: "));
        
        //Seleção da variável
        switch (produto) {
            case 10:
                produto_final = "Cereal";
                break;
            
            case 15:
                produto_final = "Leite";
                break;
                
            case 30:
                produto_final = "Macarrão";
                break;
            
            default:
                produto_final = "Item Inválido";
                break;
        }
        
        JOptionPane.showMessageDialog(null, "O produto selecionado é: " + produto_final);
    }
    
}
