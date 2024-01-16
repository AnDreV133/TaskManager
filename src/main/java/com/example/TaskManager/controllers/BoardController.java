package com.example.TaskManager.controllers;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@Controller
public class BoardController {
    private static JSONArray cards = new JSONArray();

    static {
        var jo1 = new JSONObject();
        jo1.put("id", 64581743);
        jo1.put("name", "первое");
        jo1.put("date", "31.12.23");
        jo1.put("status", 0);
        cards.put(jo1);

        var jo2 = new JSONObject();
        jo2.put("id", 9854834);
        jo2.put("name", "второе");
        jo2.put("date", "04.12.23");
        jo2.put("status", 0);
        cards.put(jo2);

        var jo3 = new JSONObject();
        jo3.put("id", 4944502);
        jo3.put("name", "третье");
        jo3.put("date", "04.12.23");
        jo3.put("status", 1);
        cards.put(jo3);
    }

    @GetMapping("/board/{id}")
    public String board(@RequestParam Long id, Model model) {
        StringBuilder htmlBoard = new StringBuilder();
        for (var card : CDL.toString(cards).split("\n")) {
            htmlBoard.append("<p>").append(card).append("</p>");
        }
        model.addAttribute("cards", htmlBoard.toString());
        return "board";
    }

//    @PostMapping("/registration")
//    public String registration(NonRegisterUser nonRegisterUser, Model model) {
//        boolean flag = true;
//        if (nonRegisterUser.getFirstPassword().matches(".{8,20}")) {
//            flag = false;
//        }
//
//        if (flag && nonRegisterUser.getFirstPassword().equals(nonRegisterUser.getSecondPassword())) {
//            flag = false;
//        }
//
//        return "redirect:" + (flag ? "/board" : "/logon");
//    }
}
