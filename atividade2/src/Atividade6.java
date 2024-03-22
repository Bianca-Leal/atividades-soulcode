import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo a loja online!");
        System.out.println("Digite o valor total da sua compra: ");
        double valorTotal = sc.nextDouble();

        double desconto = 0;

        if (valorTotal > 200) {
            desconto = valorTotal * 0.10;
        } else if (valorTotal >= 100 && valorTotal <= 200) {
            desconto = valorTotal * 0.05;
        }

        double valorFinal = valorTotal - desconto;
        System.out.println("O valor final a ser pago após o desconto é: R$ " + valorFinal);

        System.out.println("Escolha o método de pagamento:");
        System.out.println("1. Cartão de crédito");
        System.out.println("2. Boleto bancário");
        System.out.println("3. Transferência bancária");

        int opcaoPagamento = sc.nextInt();

        switch (opcaoPagamento) {
            case 1:
                System.out.println("Você escolheu pagar com cartão de crédito.");
                break;
            case 2:
                System.out.println("Você escolheu pagar com boleto bancário.");
                break;
            case 3:
                System.out.println("Você escolheu pagar com transferência bancária.");
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }

        sc.close();

    }
}
