package br.com.dacoder.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@EqualsAndHashCode
public class User {

    @Getter @Setter private String name;
    @Getter @Setter private String login;
    @Getter @Setter private String password;
    @Getter @Setter private Date birth;
    @Getter @Setter private Role role;

    @Getter @Setter private Date createdAt;
    @Getter @Setter private Date updatedAt;
    @Getter @Setter private Date deletedAt;

    public User(String name, String login, String password, Date birth, Role role) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.birth = birth;
        this.role = role;
    }

    public User(String name, String login, String password, Date birth) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.birth = birth;
        this.role = Role.VISITANT;
    }
}
