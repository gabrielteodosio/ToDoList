package br.com.dacoder.entities;

import lombok.Getter;

public enum Role {

    ADMIN ("Administrador"),
    USER ("Usuário"),
    VISITANT ("Visitante");

    @Getter private String name;

    Role (String name) {
        this.name = name;
    }
}
