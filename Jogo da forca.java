package com.forca;

//@Peixes
import java.util.Random;
import java.util.Scanner;

public class Jogodaforca {

    public static void main(String[] args) {
        // Palavras que serão usadas na forca
        String palavras[] = { "peixes", "tigre", "cavalo", "papagaio", "sapo", "zebra", "aranha", "cachorro",
        "elefante", "hipopotamo", "gato", "arara", "macaco", "baleia", "panda",
        "urso", "vaca", "tatu", "rato", "pato", "guaxinim", "canguru", "jacare", "crocodilo", "cobra",
        "rinoceronte" };
        //di.dicionario();
        // Iniciando o Scanner
        Scanner scanstring = new Scanner(System.in);
        // Iniciando as variaveis de vitoria
        boolean vitoria = false;
        boolean derrota = false;
        // Iniciando as variaveis
        int erros = 0;
        int loop = 0;
        char letra = 'a';
        String _letra = "a";
        String palavracerta;
        String palavra = "0";
        String resto = "";
        // Seleciona uma palavra aleatória
        
        Random random = new Random();
        int num = random.nextInt(palavras.length);
        palavra = palavras[num];

        // Criptografa a palavra selecionada
        palavracerta = "_".repeat(palavra.length());
        do {
            // Começa o desenho da forca
            System.out.println("|-----|");
            // Checa a variavel erros e constroi o boneco
            switch (erros) {
                case 1:
                    System.out.println("|     O");// Cabeça
                    break;
                case 2:
                    System.out.println("|     O" + "\n|     |");// Corpo
                    break;
                case 3:
                    System.out.println("|     O" + "\n|   --|--");// Braços
                    break;
                case 4:
                    System.out.println("|     O" + "\n|   --|--" + "\n|    ]");// Perna
                    break;
                case 5:
                    System.out.println("|     O" + "\n|   --|--" + "\n|    ] [");// Perna
                    break;
                default:
                    System.out.println("|     |");
                    break;
            }
            System.out.println("|     ");
            System.out.println("|  " + palavracerta);
            // Verifica se o jogo já terminou
            if (palavracerta.equals(palavra)) {
                loop++;
                vitoria = true;
                continue;
            }
            // Verifica se você errou 5 vezes e termina o jogo
            if (erros >= 5) {
                loop++;
                derrota = true;
                continue;
            }
            // Entrada de dados
            System.out.print("\n" + "Escreva uma letra ou uma palavra: ");
            // Iniciando variaveis e o scan para a forca
            _letra = scanstring.nextLine();
            resto = "";// Variável responsável por alterar a criptografia da palavra selecionada
            boolean erro = true;
            // Verifica se é uma letra
            if (_letra.length() <= 1) {
                letra = _letra.charAt(0);
                for (int i = 0; i < palavra.length(); i++) { // Vai passar o loop por todas as letras
                    if (palavra.charAt(i) == letra) {// Verifica se a letra digitada tem na palavra selecionada
                        resto += String.valueOf(letra); // Soma a letra a forca
                        erro = false;
                        continue;
                    }
                    resto += String.valueOf(palavracerta.charAt(i)); // Soma o resto da criptografia
                }
                // Verifica se é uma palavra
            } else if (_letra.length() > 1 && _letra.length() == palavra.length()) {
                for (int i = 0; i < 1; i++) { // Vai passar o loop pela palavra
                    if (palavra.equals(_letra)) {// Verifica se a palavra digitada é correta
                        resto += (_letra); // Soma a palavra a forca
                        erro = false;
                        continue;
                    }
                    resto += (palavracerta); // Soma o resto da criptografia
                }
            } else {
                System.out.print("Você digitou uma palavra incorreta, tente novamente!");
                continue;
            }
            if (erro) {
                erros++;
            }
            palavracerta = resto; // Define a palavra criptografada
        } while (loop <= 1);
        // Fecha o scanner do char
        scanstring.close();
        // Checa se venceu ou perdeu e passa a mensagem
        if (vitoria) {
            System.out.println("Parabens!!! Você venceu!!!");
        } else if (derrota) {
            System.out.println("Sinto muito, você perdeu.");
        }
    }
}
