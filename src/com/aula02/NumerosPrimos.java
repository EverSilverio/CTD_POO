package aula02_bonus;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Integer number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        number = sc.nextInt();

        if (isPrime(number))
            System.out.println("Número " + number + " é primo!");
        else
            System.out.println("Número " + number + " não é primo!");
    }

    /*
     * @isPrime
     * Função verifica se número é primo
     */
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
