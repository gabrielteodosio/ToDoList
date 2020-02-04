package br.com.dacoder.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@EqualsAndHashCode
public class Notebook {

    @Getter @Setter private String name;
    @Getter @Setter private Activity[] activities;

    @Getter @Setter private Date createdAt;
    @Getter @Setter private Date updatedAt;
    @Getter @Setter private Date deletedAt;

}
