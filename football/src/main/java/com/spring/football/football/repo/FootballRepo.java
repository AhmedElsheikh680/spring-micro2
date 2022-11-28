package com.spring.football.football.repo;

import com.spring.football.football.mode.PlayerTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballRepo extends JpaRepository<PlayerTeam, Long> {
    PlayerTeam findByFromAndTo(String from , String to);
}