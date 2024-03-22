import java.util.Random;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 0;
        int tentativa;

        System.out.println("Bem-vindo ao Jogo de Adivinhação! Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroAleatorio);

        scanner.close();
    }
}
