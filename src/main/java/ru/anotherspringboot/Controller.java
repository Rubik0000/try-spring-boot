package ru.anotherspringboot;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/autr", method = RequestMethod.POST)
    public String authorization(
            @RequestParam("login") String login,
            @RequestParam("password") String pass,
            Model model) {

        model.addAttribute("login", login);
        model.addAttribute("password", pass);
        return "authorization";
    }
}
