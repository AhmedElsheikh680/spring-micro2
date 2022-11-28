package com.spring.player.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("players.statistics")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayersStatisticsConfig {

    private int numberTeams;
    private int numberPlayers;
    private String country;

}
