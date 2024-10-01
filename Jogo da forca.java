package com.forca;

//@Peixes
import java.lang.Math;
import java.util.Scanner;

public class Jogodaforca {
    public static void main(String[] args) {
        // Iniciando o Scanner
        Scanner scanchar = new Scanner(System.in);
        // Iniciando as variaveis
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
            // Desenho da forca
            System.out.println(palavra);
            System.out.println("|-----|");
            System.out.println("|     |");
            System.out.println("|");
            System.out.print("|  ");
            System.out.print(palavracerta);
            // Entrada de dados
            System.out.print("\n" + "Escreva uma letra: ");
            letra = scanchar.next().charAt(0);
            resto = "";// Variável responsável por alterar a criptografia da palavra selecionada
            // Verifica se a letra digitada tem na palavra
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {// Verifica se a letra digitada tem na palavra selecionada
                    resto += String.valueOf(letra); // Soma a letra a forca
                    continue;
                }
                resto += String.valueOf(palavracerta.charAt(i)); // Soma o resto da criptografia
            }
            palavracerta = resto; // Define a palavra criptografada para o loop
        } while (loop < 1);
        scanchar.close();
    }

}
