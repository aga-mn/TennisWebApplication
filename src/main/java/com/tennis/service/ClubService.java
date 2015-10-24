package com.tennis.service;

import com.tennis.model.Club;
import com.tennis.model.Tournament;

import java.util.Date;
import java.util.List;

public interface ClubService {



    void addClub(Club club);
    List<Club> getAllClubs();
    void deleteClub(Club club);
    void modifyClub(Club club);
    Club getClub(int clubId);
    List<Tournament> getTournamentsByClubAndDate(int clubId, Date fromDate, Date toDate);
    //List<Tournament> getAllTournamentsByClub(int clubId);
}
