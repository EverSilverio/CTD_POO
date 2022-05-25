package com.aula06;

import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis = 10;

    public Boolean temPapel() {
        if (folhasDisponiveis != 0)
            return true;

        return false;
    }

    public void imprimir(String texto) {
        this.folhasDisponiveis--;
        System.out.println(texto);
    }

    public void adicionaPapel(int qtd){
        this.folhasDisponiveis += qtd;
    }

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }
}
