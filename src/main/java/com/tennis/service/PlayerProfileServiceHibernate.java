package com.tennis.service;

import com.tennis.dao.PlayerProfileDao;
import com.tennis.model.PlayerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlayerProfileServiceHibernate implements PlayerProfileService {

    @Autowired
    private PlayerProfileDao playerProfileDao;

    public void addPlayerProfile(PlayerProfile profile) {
        playerProfileDao.addPlayerProfile(profile);
    }

    public List<PlayerProfile> getAllProfiles() {
        return playerProfileDao.getAllProfiles();
    }

    public void deletePlayerProfile(PlayerProfile profile) {
        playerProfileDao.deletePlayerProfile(profile);
    }

    public void modifyPlayerProfile(PlayerProfile profile) {
        playerProfileDao.modifyPlayerProfile(profile);
    }

    public PlayerProfile getPlayerProfile(int playerProfileId) {
        return playerProfileDao.getPlayerProfile(playerProfileId);
    }
}
