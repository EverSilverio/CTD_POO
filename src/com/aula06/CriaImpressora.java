package com.aula06;

import java.time.LocalDate;

public class CriaImpressora {
    public static void main(String[] args) {
        Impressora nova = new Impressora("LX300", "SERIAL", LocalDate.of(1994,01,17));

        System.out.println(nova.getModelo());

        System.out.println("quantidade folhas: " + nova.getFolhasDisponiveis());

        nova.imprimir("Ola Mundo");

        System.out.println("quantidade folhas: " + nova.getFolhasDisponiveis());

    }
}
