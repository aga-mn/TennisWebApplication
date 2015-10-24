package com.tennis.dao;

import com.tennis.model.PlayerRanking;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerRankingDaoHibernate implements PlayerRankingDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRanking(PlayerRanking ranking) {
        sessionFactory.getCurrentSession().save(ranking);
    }

    @Override
    public List<PlayerRanking> getAllRankings() {
        return sessionFactory.getCurrentSession().
                createQuery("from PlayerRanking").list();
    }

    @Override
    public void deleteRanking(PlayerRanking ranking) {
        sessionFactory.getCurrentSession().delete(ranking);
    }

    @Override
    public void modifyRanking(PlayerRanking ranking) {
        sessionFactory.getCurrentSession().update(ranking);
    }

    @Override
    public PlayerRanking getRanking(int rankingId) {
        return (PlayerRanking) sessionFactory.getCurrentSession().
                get(PlayerRanking.class, rankingId);
    }

    @Override
    public List<PlayerRanking> getAllRankingsByPlayerName(String name) {
        return null;
    }

    @Override
    public List<PlayerRanking> getAllRankingsByPlayerName(String firstName, String lastName) {
        return null;
    }
}
