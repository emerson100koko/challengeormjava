package com.challenge.challengeORM.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String descricao;
    private Double price;

    @ManyToMany
    @JoinTable(name = "tb_activity_participant",
        joinColumns = @JoinColumn(name = "activity_id"),
        inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private Set<Participant> participantes = new HashSet<>();

    public Activity(){
    }

    public Activity(Long id, String name, String descricao, Double price) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Set<Participant> getParticipantes() {
        return participantes;
    }
}
