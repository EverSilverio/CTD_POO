package com.aula06;

import java.time.LocalDate;

public class Cachorro {
    private Boolean aptoParaAdocao = false;
    private String raca;
    private Double peso;
    private int anoNascimento;
    private Boolean possuiChip;
    private Boolean ferido;
    private String primeiroNome;

    public Cachorro(String raca, Double peso, int anoNascimento, Boolean possuiChip, Boolean ferido, String primeiroNome) {
        this.raca = raca;
        this.peso = peso;
        this.anoNascimento = anoNascimento;
        this.possuiChip = possuiChip;
        this.ferido = ferido;
        this.primeiroNome = primeiroNome;

        /*
        Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.
        */
        if (this.peso >= 5 && !this.ferido)
            this.aptoParaAdocao = true;

    }

    public String getIdade() {
        int idade;

        idade = LocalDate.now().getYear() - this.anoNascimento;

        if (idade == 0)
            return this.primeiroNome + " é um Filhote";

        return this.primeiroNome + " tem " + idade + " ano(s)";
    }

    public Boolean getAptoParaAdocao() {
        return aptoParaAdocao;
    }

    public String getRaca() {
        return raca;
    }

    public Double getPeso() {
        return peso;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public Boolean getPossuiChip() {
        return possuiChip;
    }

    public Boolean getFerido() {
        return ferido;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setAptoParaAdocao(Boolean aptoParaAdocao) {
        this.aptoParaAdocao = aptoParaAdocao;
    }
}
