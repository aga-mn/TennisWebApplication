package com.tennis.dao;

import com.tennis.model.Club;
import com.tennis.model.Tournament;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by amolda on 30.11.14.
 */
@Repository
public class ClubDaoHibernate implements ClubDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void addClub(Club club) {
        sessionFactory.getCurrentSession().save(club);
    }

    public List<Club> getAllClubs() {
        return sessionFactory.getCurrentSession().createQuery("from Club").
                list();
    }

    public void deleteClub(Club club) {
        sessionFactory.getCurrentSession().delete(club);
    }

    public void modifyClub(Club club) {
        sessionFactory.getCurrentSession().update(club);
    }

    public Club getClub(int clubId) {
        return (Club) sessionFactory.getCurrentSession().get(Club.class, clubId);
    }

    @Override
    public List<Tournament> getTournamentsByClubAndDate(int clubId, Date fromDate, Date toDate) {
        Club club = getClub(clubId);
        Query query = sessionFactory.getCurrentSession().createQuery
                ("from Tournament where club=:club and tournamentDate between :fromDate and :toDate");
                query.setParameter("club", club);
                query.setParameter("fromDate", fromDate);
                query.setParameter("toDate", toDate);
        return query.list();
    }

/*    @Override
    public List<Tournament> getAllTournamentsByClub(int clubId) {
        Club club = getClub(clubId);
        Query query = sessionFactory.getCurrentSession().createQuery("from Tournament where club=:club");
        query.setParameter("club", club);
        return query.list();
    }*/
}
