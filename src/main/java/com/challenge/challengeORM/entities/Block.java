package com.challenge.challengeORM.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant starting;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant ending;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block() {
    }

    public Block(Integer id, Instant starting, Instant ending) {
        this.id = id;
        this.starting = starting;
        this.ending = ending;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return starting;
    }

    public void setStart(Instant starting) {
        this.starting = starting;
    }

    public Instant getEnd() {
        return ending;
    }

    public void setEnd(Instant ending) {
        this.ending = ending;
    }
}