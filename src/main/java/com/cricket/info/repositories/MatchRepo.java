package com.cricket.info.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.info.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{
//	provide teamName
	Optional<Match> findByTeamHeading(String teamHeading);

}
