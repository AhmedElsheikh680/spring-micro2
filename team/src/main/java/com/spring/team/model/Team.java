package com.spring.team.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private long id;
    private String from;
    private String to;
    private int moneyTeam;
    private String note;
    private String numberTeam;
    private String port;
}
