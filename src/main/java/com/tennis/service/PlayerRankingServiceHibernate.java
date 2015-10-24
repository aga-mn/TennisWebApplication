package com.tennis.service;

import com.tennis.dao.PlayerRankingDao;
import com.tennis.model.PlayerRanking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //(propagation=Propagation.SUPPORTS, readOnly=true)
public class PlayerRankingServiceHibernate implements PlayerRankingService {

    @Autowired
    private PlayerRankingDao rankingDao;

    @Override
    public void addRanking(PlayerRanking ranking) {
        rankingDao.addRanking(ranking);
    }

    @Override
    public List<PlayerRanking> getAllRankings() {
        return rankingDao.getAllRankings();
    }

    @Override
    public void deleteRanking(PlayerRanking ranking) {
        rankingDao.deleteRanking(ranking);
    }

    @Override
    public void modifyRanking(PlayerRanking ranking) {
        rankingDao.modifyRanking(ranking);
    }

    @Override
    public PlayerRanking getRanking(int playerId) {
        return rankingDao.getRanking(playerId);
    }
}
