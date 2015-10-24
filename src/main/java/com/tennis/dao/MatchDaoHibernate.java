package com.tennis.dao;

import com.tennis.model.Match;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by amolda on 12.04.15.
 */
@Repository
public class MatchDaoHibernate implements MatchDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addMatch(Match match) {
        sessionFactory.getCurrentSession().save(match);
    }

    public List<Match> getAllMatches() {
        return sessionFactory.getCurrentSession().createQuery("from Match").
                list();
    }

    public void deleteMatch(Match match) {

        sessionFactory.getCurrentSession().delete(match);
    }

    public void modifyMatch(Match match) {

        sessionFactory.getCurrentSession().update(match);
    }

    public Match getMatch(int matchId) {

        return (Match) sessionFactory.getCurrentSession().get(Match.class, matchId);
    }
}
