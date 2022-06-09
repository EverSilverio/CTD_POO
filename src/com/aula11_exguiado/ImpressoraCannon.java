package com.aula11_exguiado;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora {
    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        if (this.temPapel()) {
            this.setFolhasDisponiveis(getFolhasDisponiveis() - 1);
            return "Texto sendo impresso na Cannon";
        }
        else
            return "ERRO - Cannon não tem papel!!!";

    }

    @Override
    public boolean precisaTinta() {
        return this.getPorcentagemTinta() < 15D;
    }
}
