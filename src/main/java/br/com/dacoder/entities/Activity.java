package br.com.dacoder.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@ToString
@EqualsAndHashCode
public class Activity {

    @Getter @Setter private String title;
    @Getter @Setter private String description;
    @Getter @Setter private User user;

    @Getter @Setter private Date createdAt;
    @Getter @Setter private Date updatedAt;
    @Getter @Setter private Date deletedAt;

}
