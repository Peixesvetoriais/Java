package sistema.de.carro.e.aluguel;

  import java.util.Scanner;

public class SistemaDeCarroEAluguel {
      
    public static void main(String[] args) {
        
        int    quilometro_rodado;
        short  dia_alugado;
        double taxa_quilometro;
        double taxa_alugado;
        Scanner leitor = new Scanner (System.in);
        String modelo_carro;
        
        taxa_quilometro = 0.20;
        taxa_alugado = 10.00;
        System.out.println("Calculo de Diaria de Aluguel de Carro");
        System.out.println("Qual e o modelo do seu carro?");
        modelo_carro = leitor.nextLine();
        System.out.println("A quantos dias voce alugou este carro?");
        dia_alugado = leitor.nextShort();
        System.out.println("Quantos Km rodados consta no seu carro?");
        quilometro_rodado = leitor.nextInt();
        
        double valor_dia = dia_alugado * taxa_alugado;
        double valor_quilometro = quilometro_rodado * taxa_quilometro;
        double valor_total = valor_dia + valor_quilometro;
        
        System.out.println("O valor total a se pagar pelo modelo " + modelo_carro
        + " e exatos:RS " + valor_total);
    }
    
}
