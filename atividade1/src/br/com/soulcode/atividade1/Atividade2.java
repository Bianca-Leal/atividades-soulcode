package br.com.soulcode.atividade1;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + " é " + antecessor);
        System.out.println("O sucessor de " + numero + " é " + sucessor);

        scanner.close();
    }
}
