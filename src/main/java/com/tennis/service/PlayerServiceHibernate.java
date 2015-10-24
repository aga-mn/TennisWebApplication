package com.tennis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tennis.dao.PlayerDao;
import com.tennis.model.Player;

@Service
@Transactional //(propagation=Propagation.SUPPORTS, readOnly=true)
public class PlayerServiceHibernate implements PlayerService {

    @Autowired
    private PlayerDao playerDao;

    @Override
    public void addPlayer(Player player) {
        playerDao.addPlayer(player);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerDao.getAllPlayers();
    }

    @Override
    public void deletePlayer(Player player) {
        playerDao.deletePlayer(player);
    }

    @Override
    public void modifyPlayer(Player player) {
        playerDao.modifyPlayer(player);
    }

    @Override
    public Player getPlayer(int playerId) {
        return playerDao.getPlayer(playerId);
    }

    @Override
    public Player getPlayerByUsername(String username) {
        return playerDao.getPlayerByUsername(username);
    }

    @Override
    public List<Player> getPlayersByLastName(String lastName) {
        return playerDao.getPlayersByLastName(lastName);
    }


}