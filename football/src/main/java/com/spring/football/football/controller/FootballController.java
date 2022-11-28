package com.spring.football.football.controller;

import com.spring.football.football.mode.PlayerTeam;
import com.spring.football.football.repo.FootballRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football-players")
@RequiredArgsConstructor
public class FootballController {

    private final FootballRepo footballRepo;

    @Value("${server.port}")
    private String port;
    @GetMapping("/{from}/buy/{to}")
    public ResponseEntity<?> buy(@PathVariable String from, @PathVariable String to){
        PlayerTeam playerTeam = footballRepo.findByFromAndTo(from, to);
        playerTeam.setPort(port);
        return ResponseEntity.ok(playerTeam);
    }
}
