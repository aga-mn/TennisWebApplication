package com.tennis.service;

import com.tennis.model.Match;

import java.util.List;

/**
 * Created by amolda on 12.04.15.
 */
public interface MatchService {

    public void addMatch(Match match);

    public List<Match> getAllMatches();

    public void deleteMatch(Match match);

    public void modifyMatch(Match match);

    public Match getMatch(int matchId);
}
