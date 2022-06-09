package com.aula11_exguiado;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{

    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
        if (this.temPapel()) {
            this.setFolhasDisponiveis(getFolhasDisponiveis() - 1);
            return "Texto sendo impresso na Epson";
        }
        else
            return "ERRO - Epson não tem papel!!!";
    }
}
