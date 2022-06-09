package com.aula11_exguiado;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /* CANNON */
        ImpressoraCannon cannon = new ImpressoraCannon("Cannon", "USB", LocalDate.of(2012,1,20), 1, 20D);

        cannon.setPorcentagemTinta(5D);

        if (cannon.precisaTinta())
            System.out.println(cannon.getModelo() + " precisa de tinta! " + cannon.getPorcentagemTinta() + "% de carga.");

        if (cannon.temPapel())
            System.out.println(cannon.getModelo() + " tem papel - " + cannon.getFolhasDisponiveis() + " folha(s)");
        else
            System.out.println(cannon.getModelo() + " não tem papel");

        System.out.println(cannon.imprimir());

        System.out.println(cannon.getModelo() + " tem " + cannon.getFolhasDisponiveis() + " folhas diponíveis");

        /* */
        System.out.println(" ");

        /* EPSON */
        ImpressoraEpson epson = new ImpressoraEpson("Epson", "WI-FI", LocalDate.of(2021,10,20), 50, 20D);

        if (epson.temPapel())
            System.out.println(epson.getModelo() + " tem papel - " + epson.getFolhasDisponiveis() + " folha(s)");
        else
            System.out.println(epson.getModelo() + " não tem papel");

        System.out.println(epson.imprimir());
        System.out.println(epson.imprimir());

        System.out.println(epson.getModelo() + " tem " + epson.getFolhasDisponiveis() + " folhas diponíveis");

    }
}
