package com.tennis.service;

import com.tennis.model.PlayerRanking;

import java.util.List;

public interface PlayerRankingService {

    void addRanking(PlayerRanking ranking);
    List<PlayerRanking> getAllRankings();
    void deleteRanking(PlayerRanking ranking);
    void modifyRanking(PlayerRanking ranking);
    PlayerRanking getRanking(int playerId);
}
