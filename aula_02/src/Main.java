import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer a;
        Integer b;
        Integer c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        a = sc.nextInt();

        System.out.println("Segundo número: ");
        b = sc.nextInt();

        System.out.println("Terceiro número: ");
        c = sc.nextInt();

        System.out.println(retornaMaior(a, b, c));
    }

    vinicius evandro
            william freitas
    lucas adrian
            fernanda garcia

    public static String retornaMaior(Integer a, Integer b, Integer c) {

        if (a > b && a > c) {
            return "O número maior é " + a.toString();
        } else if (b > a && b > c) {
            return "O número maior é " + b.toString();
        } else {
            return "O número maior é " + c.toString();
        }
    }
}