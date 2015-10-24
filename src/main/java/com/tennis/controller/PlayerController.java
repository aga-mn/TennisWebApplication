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
import com.tennis.model.PlayerProfile;

import com.tennis.service.PlayerService;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @Autowired
    private ClubService clubService;

    @RequestMapping("/PlayerProfile")
    public ModelAndView PlayerProfile(@ModelAttribute("player") Player player,
                                        BindingResult result) {

        return new ModelAndView("PlayerProfile", "model", 1);
    }




    @RequestMapping("/DelPlayerProfile")
    public ModelAndView getDelPlayerProfileForm(@ModelAttribute("player") Player player,
                                                BindingResult result) {
        System.out.println("1DelPlayerProfile");

        Map<String, Object> model = new HashMap<String, Object>();

        return new ModelAndView("PlayerProfileDel", "model", model);

    }





    @RequestMapping("/saveDelPlayerProfile")
    public ModelAndView saveDelPlayerProfile(@ModelAttribute("player") Player player,
                                             BindingResult result) {

        Player player1 = playerService.getPlayer(player.getPlayerId());
        playerService.deletePlayer(player1);



        System.out.println("saveDelPlayerProfile");

        Player player2 = playerService.getPlayerByUsername("2");
        playerService.deletePlayer(player2);



        return new ModelAndView("redirect:/DelPlayerProfile");
    }


    @RequestMapping("/AddPlayerProfile")
    public ModelAndView getAddPlayerProfileForm(@ModelAttribute("player") Player player,
                                        BindingResult result) {
        ArrayList<String> gender = new ArrayList<String>();
        gender.add("Male");
        gender.add("Female");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("gender", gender);
        System.out.println("AddPlayerProfile");

        return new ModelAndView("PlayerProfileAdd", "model", model);
    }

    @RequestMapping("/saveAddPlayerProfile")
    public ModelAndView saveAddPlayerProfile(@ModelAttribute("player") Player player,
                                       BindingResult result) {

        PlayerProfile prof1 = new PlayerProfile();
        prof1.setFavouritePlayer("Nadal");
//zebrac prfil
        player.setPlayerProfile(prof1);

        prof1.setPlayer(player);
        playerService.addPlayer(player);
        System.out.println("Save player data");
        return new ModelAndView("redirect:/AddPlayerProfile");
    }


    @RequestMapping("/SetPlayerClub")
    public ModelAndView SetPlayerClub(@ModelAttribute("player") Player player,
                                             BindingResult result) {

        Player player1 = playerService.getPlayer(56);
        Club club = new Club();
        club.setClubId(11);
        clubService.addClub(club);
        player1.setClub(club);
        playerService.modifyPlayer(player1);
        System.out.println("SetPlayerClub");
        return new ModelAndView("redirect:/PlayerProfile");

    }

    @RequestMapping("/GetAllPlayerProfile")
    public ModelAndView GetAllPlayerProfile() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("player", playerService.getAllPlayers());
        return new ModelAndView("PlayerProfileGetAll", model);
    }


    @RequestMapping("/GetPlayerProfile")
    public ModelAndView GetPlayerProfile() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("player", playerService.getPlayer(69));
     //   model.put("profile", playerService.getPlayer(69).getPlayerProfile());
        return new ModelAndView("PlayerProfileGet", model);
    }




    @RequestMapping("/register")
    public ModelAndView getRegisterForm(@ModelAttribute("player") Player player,
                                        BindingResult result) {
        ArrayList<String> gender = new ArrayList<String>();
        gender.add("Male");
        gender.add("Female");
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("gender", gender);
        System.out.println("Register player");

        return new ModelAndView("register", "model", model);
    }

    @RequestMapping("/savePlayer")
    public ModelAndView savePlayerData(@ModelAttribute("player") Player player,
                                       BindingResult result) {
        playerService.addPlayer(player);
        System.out.println("Save player data");
        return new ModelAndView("redirect:/playerList.html");
    }

    @RequestMapping("/savePlayer1")
    public ModelAndView savePlayerData1(@ModelAttribute("player") Player player,
                                       BindingResult result) {
      //  playerService.addPlayer(player);
        System.out.println("Save player data 2");

        Player pl1 = new Player();

        pl1.setFirstName("ssssssss");
        pl1.setLastName("sdfsdsdsdsdsd");

        PlayerProfile prof1 = new PlayerProfile();
    prof1.setFavouritePlayer("Nadal");

pl1.setPlayerProfile(prof1);

        prof1.setPlayer(pl1);



        System.out.println("Save player data 2 OK");
      playerService.addPlayer(pl1);
        return new ModelAndView("redirect:/playerList.html");
    }


    @RequestMapping("/playerList")
    public ModelAndView getPlayerList() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("player", playerService.getPlayersByLastName("sdf"));
        return new ModelAndView("playerDetails", model);
    }
}
