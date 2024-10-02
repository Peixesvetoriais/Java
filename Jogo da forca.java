package com.forca;

//@Peixes
import java.lang.Math;
import java.util.Scanner;

public class Jogodaforca {
    public static void main(String[] args) {
        // Iniciando o Scanner
        Scanner scanchar = new Scanner(System.in);
        // Iniciando as variaveis de vitoria
        boolean vitoria = false;
        boolean derrota = false;
        // Iniciando as variaveis
        int erros = 0;
        int loop = 0;
        char letra;
        String palavracerta;
        String palavra = "0";
        String resto = "";
        // Iniciando as variáveis do Math.random
        int max = 10;
        int min = 1;
        int range = ((max - min) + 1);
        // Seleciona um número de 1 a 10
        int num = (int) (Math.random() * range) + min;
        // Verifica o número selecionado e pega a palavra correspondente
        switch (num) {
            case 2:
                palavra = "peixe";
                break;
            case 3:
                palavra = "tigre";
                break;
            case 4:
                palavra = "cavalo";
                break;
            case 5:
                palavra = "papagaio";
                break;
            case 6:
                palavra = "sapo";
                break;
            case 7:
                palavra = "zebra";
                break;
            case 8:
                palavra = "aranha";
                break;
            case 9:
                palavra = "deadghost";
                break;
            case 10:
                palavra = "cleber";
                break;
            default:
                palavra = "cachorro";
                break;
        }
        // Criptografa a palavra selecionada
        palavracerta = "_".repeat(palavra.length());
        do {
            // Começa o desenho da forca
            System.out.println(palavra);
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
            System.out.print("\n" + "Escreva uma letra: ");
            // Iniciando variaveis e o scan para a forca
            letra = scanchar.next().charAt(0);
            resto = "";// Variável responsável por alterar a criptografia da palavra selecionada
            boolean erro = true;
            // Verificador da palavra selecionada
            for (int i = 0; i < palavra.length(); i++) { // Vai passar o loop por todas as letras
                if (palavra.charAt(i) == letra) {// Verifica se a letra digitada tem na palavra selecionada
                    resto += String.valueOf(letra); // Soma a letra a forca
                    erro = false;
                    continue;
                }
                resto += String.valueOf(palavracerta.charAt(i)); // Soma o resto da criptografia
            }
            // Verifica o erro e soma na variável
            if (erro) {
                erros++;
            }
            palavracerta = resto; // Define a palavra criptografada
        } while (loop <= 1);
        // Fecha o scanner do char
        scanchar.close();
        // Checa se venceu ou perdeu e passa a mensagem
        if (vitoria) {
            System.out.println("Parabens!!! Você venceu!!!");
        } else if (derrota) {
            System.out.println("Sinto muito, você perdeu.");
        }
    }
}
