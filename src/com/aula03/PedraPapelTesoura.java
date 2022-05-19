/*
Faça um programa que permita jogar o jogo "Pedra-Papel-Tesoura". Primeiro, o
aplicativo solicita o nome de cada jogador e, em seguida, qual a opção esse jogador
escolhe para jogar: pedra, papel ou tesoura. O jogo consiste em perguntar qual
opção cada um escolhe e somar pontos ao vencedor —se houver—. Defina e use
1
uma função chamada whichWin ou quemGanha com dois parâmetros com as
jogadas de cada um dos jogadores, que retorna 0 em caso de empate, 1 se o
primeiro vencer, 2 se o segundo vencer. O jogo termina quando o primeiro escolhe
"*" como indicador de fim.
*/

package com.aula03;

import java.util.Objects;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        String player1;
        String player2;
        String choice1 = "";
        String choice2 = "";
        int points1 = 0;
        int points2 = 0;

        String isContinue;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do Jogador 1: ");
        player1 = sc.next();

        System.out.print("Informe o nome do Jogador 2: ");
        player2 = sc.next();

        int winner;
        while(!Objects.equals(choice1, "*") && !Objects.equals(choice2, "*")) {
            System.out.println("---------------------");
            System.out.println("Placar: " + player1 + " " + String.valueOf(points1) + " x " + String.valueOf(points2) + " " + player2);
            System.out.println("---------------------");
            System.out.println("Escolha [ 1 ] Pedra | [ 2 ] Papel | [ 3 ] Tesoura | [ * ] Encerrar");

            System.out.printf("Escolha do jogador [ %s ]: ", player1);
            choice1 = sc.next();
            if (Objects.equals(choice1, "*"))
                break;
            System.out.println(getChoiceStr(choice1));

            System.out.printf("Escolha do jogador [ %s ]: ", player2);
            choice2 = sc.next();
            if (Objects.equals(choice2, "*"))
                break;
            System.out.println(getChoiceStr(choice2));

            winner = whichWin(choice1, choice2);

            if (winner != 0)
                if (winner == 1)
                    points1++;

            if (winner == 2) {
                points2++;
                System.out.println("Jogador " + String.valueOf(winner) + " venceu essa!");
            }  else
                System.out.println("Essa Empatou!");

            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("---------------------");
        System.out.println("Placar Final: " + player1 + " " + String.valueOf(points1) + " x " + String.valueOf(points2) + " " + player2);
        System.out.println("---------------------");
        System.out.println("Obrigado por jogar! Até a próxima");
        System.out.println("---------------------");
    }

    public static String getChoiceStr(String c) {
        String text = "";
        switch (c) {
            case "1":
                text = "1 - Pedra";
                break;
            case "2":
                text = "2 - Papel";
                break;
            case "3":
                text = "3 - Tesoura";
                break;
            default:
        }
        return text;
    }

    public static int whichWin(String choice1, String choice2) {
        int w = 0;
        switch (choice1) {
            case "1": //pedra
                if (Objects.equals(choice2, "2")) //papel
                    w = 2;

                if (Objects.equals(choice2, "3")) // tesoura
                    w = 1;
                break;
            case "2": //papel
                if (Objects.equals(choice2, "1")) //pedra
                    w = 1;

                if (Objects.equals(choice2, "3")) // tesoura
                    w = 2;
                break;
            case "3": //tesoura
                if (Objects.equals(choice2, "1")) //pedra
                    w = 2;

                if (Objects.equals(choice2, "2")) // papel
                    w = 1;
                break;
            default:
        }
        return w;
    }

}
