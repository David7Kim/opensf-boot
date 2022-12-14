package com.opensales.app.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@ResponseBody
	@RequestMapping(value="/test" , method= RequestMethod.GET)
	public Object testSession(Model model , HttpServletRequest request) {
	    HttpSession session = request.getSession();
	   logger.info("testSession : {}" , session.getAttribute("userInfo") );
	   
        return session.getAttribute("userInfo");
	    
	}
}
