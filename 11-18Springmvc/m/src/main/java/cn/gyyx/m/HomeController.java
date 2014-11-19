package cn.gyyx.m;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/test")
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	@RequestMapping("/test1")
	public String test1(HttpServletRequest request) {
		String name = request.getParameter("name");
		logger.info("*********name   ：" + name + "***************");
		return "home";
	}

	@RequestMapping("/test2")
	public String test2(String name) {
		logger.info("**********" + name + "****************");
		return "home";
	}

	@RequestMapping("/test3")
	public String test3(UserBean user) {
		logger.info(user.toString());
		return "home";
	}

	@RequestMapping(value="/test4")
	public String test4(String[] name) {
		for (String temp : name) {
			logger.info("******" + temp);
		}
		return "home";
	}
	
	@RequestMapping("/test5")
	@ResponseBody
	public UserBean test5 ( HttpServletResponse response ) {
		UserBean user = new UserBean();
		user.setAge(16);
		response.setStatus(202);
		return null;
		
	}
	
	@RequestMapping("/test6")
	public ModelAndView test6 () {
		UserBean user = new UserBean() ;
		user.setAge(18);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("u", user);
		return new ModelAndView("home",map );
	}
	
	@RequestMapping("/test7")
	public String test7 ( Map<String,Object> map ) {
		UserBean user = new UserBean();
		user.setName("tt");
		map.put("mt", user);
		return "home";
	}
	
	@RequestMapping
	public String test8 ( Model model ) {
		UserBean user = new UserBean();
		user.setName("mmm");
		model.addAttribute("u", user);
		
		return "home";
		
	}
	@RequestMapping("/test9")
	public String test9() {
		return "redirect:www.baidu.com";
	}
	
	@RequestMapping("/test10")
	public String test10() {
		return "redirect:test8";
	}

	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-mm-dd"), true));
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

}
