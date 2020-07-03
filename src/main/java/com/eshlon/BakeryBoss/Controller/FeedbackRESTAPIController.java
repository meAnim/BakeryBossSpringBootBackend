package com.eshlon.BakeryBoss.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eshlon.BakeryBoss.Model.Feedback;
import com.eshlon.BakeryBoss.Repo.FeedbackRepository;


@RestController
public class FeedbackRESTAPIController {

	@Autowired
	FeedbackRepository feedbackrepo;
//	
	@RequestMapping(value = "/feedbackDataAPIGetAll.admin", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE) 
	public List<Feedback> getFeedback() {
		
		try {
			List<Feedback> feedbackAPI = feedbackrepo.findAll();
			return feedbackAPI;
		} catch (Exception e) {
			return (List<Feedback>) e;
		}
	}
	
	@RequestMapping(value = "/feedbackDataAPIAdd.admin", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) 
	public ResponseEntity<Void> postFeedback(@RequestBody Feedback feedback) {
		try {
			feedbackrepo.save(feedback);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
	}
}
