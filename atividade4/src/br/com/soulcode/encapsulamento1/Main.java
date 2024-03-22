package br.com.soulcode.encapsulamento1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Suprimentos suprimento = new Suprimentos(1, "Teclado", 2, 50.0);


        System.out.println("Número do Item: " + suprimento.getNumeroItem());
        System.out.println("Descrição do Item: " + suprimento.getDescricaoItem());
        System.out.println("Quantidade Comprada: " + suprimento.getQuantidadeComprada());
        System.out.println("Preço Unitário: " + suprimento.getPrecoUnitario());
        System.out.println("Valor da Fatura: " + suprimento.getValorFatura());
    }
}