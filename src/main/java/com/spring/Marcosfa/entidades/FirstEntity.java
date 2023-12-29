package com.spring.Marcosfa.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FirstEntity {

    //Las entidades siempre deben tener un id
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
