package com.tennis.controller;

import com.tennis.model.Club;
import com.tennis.model.Player;
import com.tennis.model.PlayerProfile;
import com.tennis.service.PlayerProfileService;
import com.tennis.service.PlayerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProfileController {

    @Autowired
    private PlayerProfileService profileService;

    @Autowired
    private PlayerService playerService;

    @RequestMapping("/profile")
    public ModelAndView getRegisterForm(@ModelAttribute("playerProfile") PlayerProfile profile,
                                        BindingResult result) {
        Map<String, Object> model = new HashMap<String, Object>();
        List<String> hand = new ArrayList<String>();
        hand.add("Prawa");
        hand.add("Lewa");
        List<Player> players = playerService.getAllPlayers();
        model.put("hand", hand);
        model.put("players", players);
        return new ModelAndView("profile", "model", model);
    }

    @RequestMapping("/saveProfile")
    public ModelAndView saveProfileData(@ModelAttribute("playerProfile") PlayerProfile profile,
                                     BindingResult result) {

        System.out.println("saveProfile");
        System.out.println(profile);
        profileService.addPlayerProfile(profile);
        System.out.println("Save profile data");
        return new ModelAndView("redirect:/profileList.html");
    }

    @RequestMapping("/profileList")
    public ModelAndView getProfileList() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("profile", profileService.getAllProfiles());
        return new ModelAndView("profileDetails", model);
    }

}
