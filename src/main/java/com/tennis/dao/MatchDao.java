package com.tennis.dao;

import com.tennis.model.Match;

import java.util.List;

/**
 * Created by amolda on 12.04.15.
 */
public interface MatchDao {
    void addMatch (Match match);
    List<Match> getAllMatches();
    void deleteMatch(Match match);
    void modifyMatch(Match match);
    Match getMatch(int matchId);
}
