package com.tennis.dao;

import com.tennis.model.PlayerProfile;

import java.util.List;


public interface PlayerProfileDao {

    void addPlayerProfile(PlayerProfile profile);
    List<PlayerProfile> getAllProfiles();
    void deletePlayerProfile(PlayerProfile profile);
    void modifyPlayerProfile(PlayerProfile profile);
    PlayerProfile getPlayerProfile(int playerId);
}
