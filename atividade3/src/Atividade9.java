import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = converterCelsiusParaFahrenheit(celsius);
                    System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                    break;
                case 2:
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheit2 = scanner.nextDouble();
                    double celsius2 = converterFahrenheitParaCelsius(fahrenheit2);
                    System.out.println("Temperatura em Celsius: " + celsius2);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
