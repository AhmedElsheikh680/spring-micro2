package com.spring.player.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayersStatistics {

    private int numberTeams;
    private int numberPlayers;
    private String country;
}
