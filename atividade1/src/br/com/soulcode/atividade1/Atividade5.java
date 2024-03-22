package br.com.soulcode.atividade1;

import java.util.Scanner;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        String idadeString = scanner.nextLine();

        // Tentativa de converter a entrada de idade em um número inteiro
        int idade;
        try {
            idade = Integer.parseInt(idadeString);
        } catch (NumberFormatException e) {
            System.out.println("A idade inserida não é um número válido.");
            scanner.close();
            return;
        }

        System.out.print("Informe o ano atual: ");
        int anoAtual = scanner.nextInt();

        int anoNascimento = anoAtual - idade;

        System.out.println("\nOlá, " + nome + "!");
        System.out.println("Você nasceu no ano de " + anoNascimento + ".");

        scanner.close();
    }
}

