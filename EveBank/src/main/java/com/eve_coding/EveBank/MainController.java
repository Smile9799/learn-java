package com.eve_coding.EveBank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String welcome(){
        return "hello";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(HttpServletRequest request){
        String name = request.getParameter("fname");
        request.setAttribute("name",name);
        return "displayName";
    }
}
