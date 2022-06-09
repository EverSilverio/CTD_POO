package com.aula11_mesa;

public abstract class Animal {
    private String nome;
    private int idade;

    public void emitirSom() {
        System.out.println("Animal " + this.getNome() + " emite som");
    }

    public abstract void correr();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
