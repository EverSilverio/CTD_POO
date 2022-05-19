/*
Implemente um programa que nos permita exibir os primeiros "n" números primos
pelo console, onde "n" é um valor numérico inserido pelo usuário. Por exemplo:
Com n = 7, o que o programa deve retornar é "Os primeiros 7 números primos são:
2, 3, 5, 7, 11, 13, 17".
*/

package com.aula03;

import java.util.Scanner;

public class PrimeirosPrimos {

    public static void main(String[] args) {
        int numero;

        String listaPrimo = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos numeros primos quer ver:");
        numero = sc.nextInt();

        int n = 2;
        int numerosPrimos = 0;
        while(numerosPrimos < numero) {
            if (isPrime(n)) {
                listaPrimo = (listaPrimo == "") ? String.valueOf(n) : listaPrimo + ", " + String.valueOf(n);
                numerosPrimos += 1;
            }
            n += 1;
        }
        System.out.println("Os " + String.valueOf(numero) + " primeiros números primos são: " + listaPrimo);
    }

    public static Boolean isPrime(Integer n) {
        // se número menor ou igual a 1 não é primo
        if (n <= 1)
            return false;

        // itera entre 2 e o número e verifica se é divisível
        // por algum numero até (n - 1)
        for (int i = 2; i < n; i++)
            // se o número é divisível por algum número da iteração
            // então  não é primo
            if (n % i == 0)
                return false;

        // se não entrar na validação acima é divisível apenas
        // por 1 e ele mesmo
        return true;
    }

}
