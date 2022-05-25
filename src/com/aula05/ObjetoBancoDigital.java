package com.aula05;

public class ObjetoBancoDigital {

    public static void main(String[] args) {
        BancoDigital cliente1 = new BancoDigital(1, "Diana");
        BancoDigital cliente2 = new BancoDigital(2, "Giovana");

        BancoDigital cliente3 = new BancoDigital(2, "Everton");

        cliente1.aumentarDivida(1000.00);
        cliente1.pagarDivida(100.00);

        cliente2.aumentarDivida(500.00);
        cliente2.setNome("Maria");

        System.out.println(
            String.format("A dívida do cliente %s é %s.", cliente2.getNome(), cliente2.getDivida())
        );

        cliente3.pagarDivida(100.00);
    }
}
