import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int valorAbsoluto;

        if (numero > 0) {
            System.out.println("O número digitado é positivo.");
        } else if (numero < 0) {
            valorAbsoluto = Math.abs(numero);
            System.out.println("O número digitado é negativo. Seu valor absoluto é: " + valorAbsoluto);
        } else {
            System.out.println("O número digitado é zero.");
        }

        switch(numero % 2) {
            case 0:
                System.out.println("O número digitado é par.");
                break;
            case 1:
            case -1:
                System.out.println("O número digitado é ímpar.");
                break;
        }
        sc.close();

    }
}
