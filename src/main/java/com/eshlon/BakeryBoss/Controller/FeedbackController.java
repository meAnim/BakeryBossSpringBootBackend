package com.eshlon.BakeryBoss.Controller;

import java.security.Principal;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.eshlon.BakeryBoss.Model.Feedback;
import com.eshlon.BakeryBoss.Model.User;
import com.eshlon.BakeryBoss.Repo.FeedbackRepository;
import com.eshlon.BakeryBoss.Repo.UserRepository;


@Controller                                                                                                                                                                                                       
public class FeedbackController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	FeedbackRepository feedbackrepo;
	
	@RequestMapping("/feedback.user")
	public String feedback(Principal principal, HttpServletRequest request) {
		User user =  userRepo.findByEmail(principal.getName());
		String usere = user.getFirstname().toString() + ' ' + user.getLastname().toString();
		HttpSession session = request.getSession();
		session.setAttribute("user", usere);

		return "views/feedback.jsp";
	}
	
	@RequestMapping("/addFeedback.user")
	public String addFeedback(@ModelAttribute("feedback") Feedback feedback){
		
		feedbackrepo.save(feedback);
		return "views/successfulEntry.jsp";
	}
	
	@RequestMapping("/fetchOneRecordFeedback.user")
	public ModelAndView fetchOneRecordFeedback() {
		long id = 4;
		ModelAndView mv = new ModelAndView("views/successfulSingleFeedback.jsp");
		Feedback feedback = feedbackrepo.findById(id);
		mv.addObject(feedback);
		return mv;
	}
	
	@RequestMapping("/fetchMultipleRecordsFeedback.admin")
	public ModelAndView fetchMultipleRecordsFeedback() {	
		ModelAndView mv = new ModelAndView("views/successfulMultipleFeedback.jsp");
		List<Feedback> feedbackList = feedbackrepo.findAll();
//		List<Feedback> feedbackList = feedbackrepo.findByCode("123wqas");
		mv.addObject(feedbackList);
		return mv ;
	}
}
