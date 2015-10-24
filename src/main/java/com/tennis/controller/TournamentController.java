package com.tennis.controller;

import com.tennis.model.Club;
import com.tennis.model.Player;
import com.tennis.model.Tournament;
import com.tennis.service.ClubService;
import com.tennis.service.TournamentService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by amolda on 18.04.15.
 */
@Controller
public class TournamentController {

    private static final Logger logger = LogManager.getLogger(TournamentController.class);

    @Autowired
    private TournamentService tournamentService;
    @Autowired
    private ClubService clubService;

    @RequestMapping("/tournament")
    public ModelAndView addTournament(@ModelAttribute("tournament") Tournament tournament,
                                      BindingResult result) {

        //Club club = clubService.getClub(12);
/*        List<Tournament> torunamentList = clubService.getAllTournamentsByClub(11);
       System.out.println("Pobrane turnieje:");
      for (Tournament t : torunamentList) {
           System.out.println(t);
        }*/
        Date dateFrom = null;
        Date dateTo = null;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFrom = format.parse("2015-04-11");
            dateTo = format.parse("2015-05-23");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //List<Tournament>tournamentListByDate = clubService.getTournamentsByClubAndDate(12, dateFrom, dateTo);

       List<Tournament> tournamentsByLocation = tournamentService.getAllActiveTournamentsByLocation("szawa");
       //System.out.println("Pobrane aktywne:");
        logger.debug("Pobrane aktywne");
        for (Tournament t : tournamentsByLocation) {
            System.out.println(t);
        }
//
//        Tournament tournament1 = new Tournament();
//        tournament1.setClub(club);
//        tournament1.setSurface("hard");
//        tournament1.setLocation("Barcelona");
//        Date data = null;
//        try {
//            data = format.parse("2015-04-29");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        tournament1.setTournamentDate(data);
//        System.out.println(tournament1.getSurface());
//        System.out.println(tournament1);
//        tournamentService.addTournament(tournament1);
//        System.out.println("Set Tournament");
        return new ModelAndView("redirect:/PlayerProfile");

    }

}
