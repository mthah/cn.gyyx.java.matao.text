package cn.gyyx.java;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gyyx.java.matao.beans.UserInfo;
import cn.gyyx.java.matao.dao.RegesterUser;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("/test1")
	public String regesterUserInfo(UserInfo userInfo ) {
		RegesterUser regester = new RegesterUser();
		regester.regesterUserInfo(userInfo);
		return "success";
	}
	
	
/*	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String regesterUserInfo( String [] info ) {
		UserInfo  userInfo = new UserInfo ();
		userInfo.setUserName(info[0]);
		userInfo.setPassWord(info[1]);
		RegesterUser regester = new RegesterUser();
		regester.regesterUserInfo(userInfo);
		return "index";
	}
	*/
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	*/
}
