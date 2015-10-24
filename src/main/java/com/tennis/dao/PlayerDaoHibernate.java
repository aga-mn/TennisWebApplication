package com.tennis.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.tennis.model.Player;

@Repository
public class PlayerDaoHibernate implements PlayerDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPlayer(Player player) {
        sessionFactory.getCurrentSession().save(player);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Player> getAllPlayers() {
        return sessionFactory.getCurrentSession().createQuery(
                "from Player").list();
    }

    @Override
    public void deletePlayer(Player player) {
        sessionFactory.getCurrentSession().delete(player);
    }

    @Override
    public void modifyPlayer(Player player) {
        sessionFactory.getCurrentSession().update(player);
    }

    @Override
    public Player getPlayer(int playerId) {
        return (Player) sessionFactory.getCurrentSession().
                get(Player.class, playerId);
    }

    @Override
    public Player getPlayerByUsername(String username) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Player where username = :username ");
        query.setParameter("username", username);
        List<?> list = query.list();
        Player player = (Player)list.get(0);
        return  player;
    }

    @Override
    public List<Player> getPlayersByLastName(String lastName) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Player where lastName like :lastName ");
        query.setParameter("lastName", "%"+lastName+"%");
        return query.list();
    }

}