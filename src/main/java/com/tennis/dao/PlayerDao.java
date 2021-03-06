
package com.tennis.dao;

import com.tennis.model.Player;

import java.util.List;

public interface PlayerDao {

    void addPlayer(Player player);
    List<Player> getAllPlayers();
    void deletePlayer(Player player);
    void modifyPlayer(Player player);
    Player getPlayer(int playerId);
    Player getPlayerByUsername(String username);
    List<Player> getPlayersByLastName(String lastName);

}