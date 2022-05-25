package com.aula05_mesa;

public class start {
    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Everton", "BichoPapao");

        usuario1.showStatus("score");

        usuario1.getName();

        usuario1.getNickName();
    }
}
