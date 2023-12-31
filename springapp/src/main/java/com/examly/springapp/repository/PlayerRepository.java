package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByCategoryAndSoldFalse(String category);
}
