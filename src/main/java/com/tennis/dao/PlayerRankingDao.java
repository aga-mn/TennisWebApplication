package com.tennis.dao;

import com.tennis.model.Club;
import com.tennis.model.PlayerRanking;

import java.util.List;

public interface PlayerRankingDao {
    void addRanking(PlayerRanking ranking);
    List<PlayerRanking> getAllRankings();
    void deleteRanking(PlayerRanking ranking);
    void modifyRanking(PlayerRanking ranking);
    PlayerRanking getRanking(int playerId);
    List<PlayerRanking> getAllRankingsByPlayerName(String name);
    List<PlayerRanking> getAllRankingsByPlayerName(String firstName, String lastName);
}
