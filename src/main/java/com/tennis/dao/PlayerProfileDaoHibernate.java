package com.tennis.dao;

import com.tennis.model.PlayerProfile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerProfileDaoHibernate implements PlayerProfileDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPlayerProfile(PlayerProfile profile) {
       sessionFactory.getCurrentSession().save(profile);
    }

    @Override
    public List<PlayerProfile> getAllProfiles() {
        return sessionFactory.getCurrentSession().
                createQuery("from PlayerProfile").list();
    }

    @Override
    public void deletePlayerProfile(PlayerProfile profile) {
        sessionFactory.getCurrentSession().delete(profile);
    }

    @Override
    public void modifyPlayerProfile(PlayerProfile profile) {

        sessionFactory.getCurrentSession().update(profile);
    }

    @Override
    public PlayerProfile getPlayerProfile(int playerId) {
        return (PlayerProfile) sessionFactory.getCurrentSession().
                get(PlayerProfile.class, playerId);
    }
}
