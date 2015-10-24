package com.tennis.service;

import com.tennis.dao.MatchDao;
import com.tennis.model.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by amolda on 12.04.15.
 */
@Service
@Transactional //(propagation=Propagation.SUPPORTS, readOnly=true)
public class MatchServiceHibernate implements MatchService {

    @Autowired
    private MatchDao matchDao;

    public void addMatch(Match match) {
        matchDao.addMatch(match);
    }

    public List<Match> getAllMatches() {
        return matchDao.getAllMatches();
    }

    public void deleteMatch(Match match) {
        matchDao.deleteMatch(match);
    }

    public void modifyMatch(Match match) {
        matchDao.modifyMatch(match);
    }

    public Match getMatch(int matchId) {
        return matchDao.getMatch(matchId);
    }
}
