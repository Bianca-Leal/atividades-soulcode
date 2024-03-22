import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
