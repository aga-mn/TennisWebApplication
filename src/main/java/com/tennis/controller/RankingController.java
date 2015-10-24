package com.tennis.controller;

import com.tennis.dao.PlayerRankingDao;
import com.tennis.model.Club;
import com.tennis.model.Player;
import com.tennis.model.PlayerRanking;
import com.tennis.model.Tournament;
import com.tennis.service.PlayerRankingService;
import com.tennis.service.PlayerService;
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
public class RankingController {

    @Autowired
    PlayerRankingService rankingService;
    @Autowired
    PlayerService playerService;

    @RequestMapping("/ranking")
    public ModelAndView addRanking(@ModelAttribute("ranking") PlayerRanking ranking,
                                      BindingResult result) {

         Player player = playerService.getPlayer(57);
         PlayerRanking myRanking = new PlayerRanking();
         myRanking.setPlayer(player);
         myRanking.setMatchesWon(10);
         myRanking.setMatchesLost(5);
         System.out.println(myRanking);
         rankingService.addRanking(myRanking);
         System.out.println("Set Ranking");
         return new ModelAndView("redirect:/PlayerProfile");

    }
}
