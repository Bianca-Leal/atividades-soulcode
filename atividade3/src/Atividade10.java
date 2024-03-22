import java.util.ArrayList;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        String item;
        char continuar;

        do {
            System.out.print("Digite o item que deseja adicionar à lista de compras: ");
            item = scanner.nextLine();
            listaDeCompras.add(item);

            System.out.println("Lista de compras atualizada:");
            for (String listItem : listaDeCompras) {
                System.out.println("- " + listItem);
            }

            System.out.print("Deseja adicionar mais itens? (S/N): ");
            continuar = scanner.nextLine().toUpperCase().charAt(0);
        } while (continuar == 'S');

        System.out.println("Lista de compras final:");
        for (String listItem : listaDeCompras) {
            System.out.println("- " + listItem);
        }

        scanner.close();
    }
}