package com.tennis.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.tennis.model.Club;
import com.tennis.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tennis.model.Player;
import com.tennis.service.PlayerService;

@Controller
public class ClubController {

    @Autowired
    private ClubService clubService;

 @RequestMapping("/club")
    public ModelAndView getRegisterForm(@ModelAttribute("club") Club club,
                                        BindingResult result) {

        Map<String, Object> model = new HashMap<String, Object>();
        return new ModelAndView("club", "model", model);
    }


    @RequestMapping("/saveClub")
    public ModelAndView saveClubData(@ModelAttribute("club") Club club,
                                       BindingResult result) {

        System.out.println("saveClub");
        System.out.println(club);
        clubService.addClub(club);
        System.out.println("Save club data");
        return new ModelAndView("redirect:/clubList.html");
    }

    @RequestMapping("/clubList")
    public ModelAndView getClubList() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("club", clubService.getAllClubs());
        return new ModelAndView("clubDetails", model);
    }
}
