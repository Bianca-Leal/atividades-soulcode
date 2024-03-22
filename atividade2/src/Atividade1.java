import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======= CADASTRO =======");
        System.out.println("Olá, e qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("==============");
        System.out.println("Olá usuário, qual sua idade ?");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("==============");
        System.out.println("Seu nome é " + nome + ", sua idade é " + idade);
    }
}
