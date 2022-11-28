package com.spring.team.controller;

import com.spring.team.config.Proxy;
import com.spring.team.model.Team;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.temporal.TemporalAccessor;
import java.util.Locale;

@RestController
@RequestMapping("/team-players")
@RequiredArgsConstructor
public class TeamController {

    private final RestTemplate restTemplate;
    private  final Proxy proxy;

    private static final String BASE_URL="http://localhost:1111/football-players";

//    @GetMapping("/team/{from}/player/{to}")
//    public ResponseEntity<?> teamWithPlayer(@PathVariable String from, @PathVariable String to){
//        Map<String, String> urlAttr = new HashMap<>();
//        urlAttr.put("from", from);
//        urlAttr.put("to", to);
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<Team> entity = new HttpEntity<>(httpHeaders);
//        ResponseEntity<Team> teamResponse =
//                restTemplate.exchange(BASE_URL + "/{from}/buy/{to}", HttpMethod.GET, entity, Team.class, urlAttr);
//        return ResponseEntity.ok(teamResponse.getBody());
//    }

    @GetMapping("/team/{from}/player/{to}")
    public ResponseEntity<?> teamWithPlayer(@PathVariable String from, @PathVariable String to){
        return ResponseEntity.ok(proxy.getFootballPlayers(from, to));
    }
}
