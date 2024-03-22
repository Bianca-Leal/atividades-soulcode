import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while (true) {
            System.out.print("Digite um número inteiro positivo (ou um número negativo para sair): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            total += numero;
            count++;
        }

        if (count > 0) {
            double media = (double) total / count;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi inserido.");
        }

        scanner.close();
    }
}