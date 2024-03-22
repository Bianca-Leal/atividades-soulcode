package br.com.soulcode.atividade4;

public class Suprimentos {
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;

    // Construtor
    public Suprimentos(int numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;

        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }

        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    // Método para obter o número do item
    public int getNumeroItem() {
        return numeroItem;
    }

    // Método para definir o número do item
    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    // Método para obter a descrição do item
    public String getDescricaoItem() {
        return descricaoItem;
    }

    // Método para definir a descrição do item
    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    // Método para obter a quantidade comprada do item
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    // Método para definir a quantidade comprada do item
    public void setQuantidadeComprada(int quantidadeComprada) {
        // Verifica se a quantidade é positiva, se não for, define como 0
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
    }

    // Método para obter o preço unitário do item
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    // Método para definir o preço unitário do item
    public void setPrecoUnitario(double precoUnitario) {
        // Verifica se o preço unitário é positivo, se não for, define como 0.0
        if (precoUnitario > 0.0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    // Método para calcular o valor da fatura
    public double getValorFatura() {
        return quantidadeComprada * precoUnitario;
    }
}
