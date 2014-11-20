package cn.gyyx.java;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.gyyx.java.matao.beans.UserInfo;
import cn.gyyx.java.matao.dao.Login;
import cn.gyyx.java.matao.dao.RegesterUser;
import cn.gyyx.java.matao.dao.SelectAllUser;
import cn.gyyx.java.matao.dao.SelectPageCount;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * 用来进行注册的Controller
	 * @param userInfo
	 * @return
	 */
	@RequestMapping("/regest")
	public String regesterUserInfo(UserInfo userInfo ) {
		RegesterUser regester = new RegesterUser();
		regester.regesterUserInfo(userInfo);
		return "success";
	}
	
	/**
	 * 查询所有用户信息和分页的Controller
	 * @param page
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectAll")
	public String selectAllUserInfo( @RequestParam  int page,Model model ) {
		List<Integer> listPage = new ArrayList<Integer> ();
		SelectAllUser selectAll= new SelectAllUser ();
		SelectPageCount pageCount = new SelectPageCount ();
		List<UserInfo> list=selectAll.selectAllUserInfo(page);
		int maxPage = pageCount.SelectMaxPage(); 
		listPage = pageCount.pageCount(maxPage);
		model.addAttribute("list",list);
		model.addAttribute("pageCount",maxPage);
		model.addAttribute("listPage",listPage);
		return "show";
	}
	
	@RequestMapping("login")
	public String userLogin( UserInfo userInfo,Model model ) {
		Login login =new Login();
		Integer code=login.userLongin(userInfo);
		logger.info("Welcome home! The client locale is {}.********************************"+ code + "****************");
		model.addAttribute("code", code);
		if( code != null ) {
			return "home";
		}else {
			return "index";
		}
		
	}
	
/*	@RequestMapping("/selectAll1")
	public String usePageSelect( @RequestParam  int page,Model model ) {
		SelectAllUser selectAll= new SelectAllUser ();
		SelectPageCount pageCount = new SelectPageCount ();
		int maxPage = pageCount.SelectMaxPage(); 
		List<UserInfo> list=selectAll.selectAllUserInfo(page);
		List<Integer> listPage = new ArrayList<Integer> ();
		listPage = pageCount.pageCount(maxPage);
		model.addAttribute("list",list);
		model.addAttribute("pageCount",maxPage);
		model.addAttribute("listPage",listPage);
		return "show";
	}*/
	
	
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
