package com.aula11_mesa;

public class Cachorro extends Animal{

    @Override
    public void correr() {
        System.out.println(this.getNome() + " corre!");
    }
}
