import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro número:");
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= CALCULADORA =======");
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int soma, multi, sub;
        double div;

        soma = n1 + n2;
        System.out.println("O resultado da soma é " + soma);
        multi = n1 * n2;
        System.out.println("O resultado da multiplicação é " + multi);
        sub = n1 - n2;
        System.out.println("O resultado da subtração é " + sub);
        div = (double) n1 / n2;
        System.out.println("O resultado da divisão é " + String.format("%.5f", div));
    }
}
