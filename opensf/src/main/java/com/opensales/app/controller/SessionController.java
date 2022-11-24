package com.opensales.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
    
    private static final Logger logger = LoggerFactory.getLogger(SessionController.class);
    
    @ResponseBody
    @RequestMapping(value="/userinfo" , method= RequestMethod.GET)
    public Object testSession(Model model , HttpServletRequest request) {
        HttpSession session = request.getSession();
       logger.info("userSession : {}" , session.getAttribute("userInfo") );
       
    return session.getAttribute("userInfo");
        
    }

}
