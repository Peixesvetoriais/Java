package switchcaseexercise03;
//@peixes
//Menu de seleção
import javax.swing.JOptionPane;

public class SwitchCaseExercise03 {

    
    public static void main(String[] args) {
        //Iniciando variáveis
        int     menu;
        int     submenu;
        
        //Entrada de dados
        menu = Integer.parseInt(JOptionPane.showInputDialog("Qual serviço você deseja acessar?|" + 
               "(1) Cadastrar Usuário|" + 
               "(2) Alterar Dados|" + 
               "(3) Excluir Usuário|"));
        
        //Seleção de variáveis E Saída de dados
        switch (menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Você se cadastrou com sucesso.");
                break;
            case 2: {
                //Submenu de Alterar Dados
                submenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o serviço que deseja acessar: " +
                "(1) Alterar Nome" +
                "(2) Alterar Endereço" +
                "(3) Alterar Telefone" +
                "(4) Alterar RG"));
                //Saída de Dados
                switch (submenu){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Você alterou seu nome com sucesso.");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "Você alterou seu endereço com sucesso.");
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "Você alterou seu telefone com sucesso.");
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "Você alterou seu RG com sucesso.");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Serviço inválido.");
                        break;
                }
                break;
            }   
            case 3:
                JOptionPane.showMessageDialog(null, "Você excluiu sua conta de Usuário com sucesso.");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Serviço Inválido.");
                break;
        }
        
    }
    
}
