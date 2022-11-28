package com.spring.player.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.player.config.PlayersStatisticsConfig;
import com.spring.player.model.PlayersStatistics;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayersStatisticsController {

    private final PlayersStatisticsConfig playersStatisticsConfig;

    @GetMapping("/statistics")
    public ResponseEntity<?> getPlayersStatistics(){
//        return ResponseEntity.ok(new PlayersStatistics(10,20,"Caairo"));
        playersStatisticsConfig.getNumberTeams();
        return ResponseEntity.ok(new PlayersStatistics(playersStatisticsConfig.getNumberTeams(),
                playersStatisticsConfig.getNumberPlayers(), playersStatisticsConfig.getCountry()));
    }

    @GetMapping("/salary")
    @HystrixCommand(fallbackMethod = "callBack")
    public String getSalary(){
        throw new NullPointerException("ERROR");
    }

    public String callBack(){
        return "SERVICE DOWN NOW!!!!!!!!!!!";
    }
}
