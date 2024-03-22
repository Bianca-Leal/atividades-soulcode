import java.util.Scanner;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        sc.nextLine(); // Consumindo a nova linha deixada pelo nextInt()

        if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo.");
        } else {
            System.out.println("O número digitado é zero.");
        }

        sc.close();
    }
}
