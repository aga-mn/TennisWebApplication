package com.tennis.controller;

/**
 * Created by niewega on 2014-12-03.
 */

  import java.util.HashMap;
        import java.util.Map;


        import org.springframework.stereotype.Controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.servlet.ModelAndView;


        import com.tennis.service.PlayerService;
  import com.tennis.model.Player;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMethod;

import org.codehaus.jackson.map.ObjectMapper;
  import java.util.List;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);


    private PlayerService playerService;
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );

        return "home";
    }



    @RequestMapping(value = {"/", "/draw"}, method = RequestMethod.GET)
    public String draw(Locale locale, Model model) {


        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );

        return "draw";
    }


    @RequestMapping("/drawservice")
    public ModelAndView drawservice(){
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> model=new HashMap<String, Object>();
      //  model.put("player", playerService.getAllPlayers());
        List<Player> list=playerService.getAllPlayers();
        System.out.println(list.toString().toString());
       // String json = "";
     //   try {
       //     json = mapper.writeValueAsString( list);
   //     } catch (Exception e) {
    //        e.printStackTrace();
    //    }
        model.put("player", list);
        System.out.println("Json");
      //  System.out.println(json.toString());
        return new ModelAndView("drawservice", model);
    }



}