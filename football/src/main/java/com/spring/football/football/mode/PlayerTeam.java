package com.spring.football.football.mode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
public class PlayerTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "from_")
    private String from;

    @Column(name = "to_")
    private String to;

    private int moneyPlayer;

    private int moneyTeam;

    private String name;

    @Transient
    private String port;
}
