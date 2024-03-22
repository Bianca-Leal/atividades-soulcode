package br.com.soulcode.encapsulamento2;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Bianca", "Leal", 5000.0);
        Colaborador colaborador2 = new Colaborador("Nathaly", "Fernandes", 6000.0);


        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " +
                colaborador1.getSobrenome() + ": " + colaborador1.salarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " +
                colaborador2.getSobrenome() + ": " + colaborador2.salarioAnual());


        colaborador1.aumentarSalario(10);
        colaborador2.aumentarSalario(10);

        System.out.println("\nApós o aumento de 10%:");
        System.out.println("Salário anual de " + colaborador1.getPrimeiroNome() + " " +
                colaborador1.getSobrenome() + ": " + colaborador1.salarioAnual());
        System.out.println("Salário anual de " + colaborador2.getPrimeiroNome() + " " +
                colaborador2.getSobrenome() + ": " + colaborador2.salarioAnual());
    }
}
