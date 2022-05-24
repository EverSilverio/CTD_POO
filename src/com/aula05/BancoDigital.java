package com.aula05;

public class BancoDigital {
    private int numeroCliente;
    private String nome;
    private Double divida;

    public BancoDigital(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
        this.divida = 0D;
    }

    public void aumentarDivida(Double valor) {
        this.divida += valor;
        System.out.println("O saldo devedor do cliente " + this.nome + " é " + this.divida);
        /* string.format*/
    }

    public void pagarDivida(Double valor){
        if (this.divida == 0) {
            System.out.println("Não há dívida á pagar");
        }
        else {
            this.divida -= valor;
            System.out.println("O saldo devedor do cliente " + this.nome + " é " + this.divida);
        }
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDivida() {
        return divida;
    }

    public void setDivida(Double divida) {
        this.divida = divida;
    }
}
