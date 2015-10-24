package com.tennis.controller;

import com.tennis.dao.PlayerRankingDao;
import com.tennis.model.*;
import com.tennis.service.MatchService;
import com.tennis.service.PlayerRankingService;
import com.tennis.service.PlayerService;
import com.tennis.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by amolda on 19.04.15.
 */
@Controller
public class MatchController {

    @Autowired
    MatchService matchService;
    @Autowired
    TournamentService tournamentService;

    @RequestMapping("/match")
    public ModelAndView addMatch(@ModelAttribute("match") Match match,
                                   BindingResult result) {

        Tournament tournament = tournamentService.getTournament(2);
        Match myMatch = new Match();
        myMatch.setTournament(tournament);
        myMatch.setPlayer1(57);
        myMatch.setPlayer2(58);
        System.out.println(myMatch);
        matchService.addMatch(myMatch);
        System.out.println("Set Match");
        return new ModelAndView("redirect:/PlayerProfile");

    }
}
