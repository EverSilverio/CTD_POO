package com.aula06;

public class ObjetoCachorro {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("PitBull",5.2,2020, true, false, "Rex");

        System.out.println(dog1.getPrimeiroNome());
        String apto = dog1.getAptoParaAdocao() ? "Sim" : "Não";
        System.out.println(dog1.getIdade());
        System.out.println("apto para adoção? " + apto);

        Cachorro dog2 = new Cachorro("poodle",3.2,2022, true, false, "Lulu");

        System.out.println(dog2.getPrimeiroNome());
        String apto2 = dog2.getAptoParaAdocao() ? "Sim" : "Não";
        System.out.println(dog2.getIdade());
        System.out.println("apto para adoção? " + apto2);
    }
}
