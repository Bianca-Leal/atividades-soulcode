package br.com.soulcode.encapsulamento1;

public class Colaborador {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Colaborador(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0.0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }

    public double salarioAnual() {
        return getSalarioMensal() * 12;
    }

    public void aumentarSalario(double percentual) {
        double novoSalario = getSalarioMensal() * (1 + percentual / 100);
        setSalarioMensal(novoSalario);
    }

}
