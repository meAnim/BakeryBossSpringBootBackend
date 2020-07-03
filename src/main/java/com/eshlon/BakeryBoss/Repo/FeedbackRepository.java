package com.eshlon.BakeryBoss.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.eshlon.BakeryBoss.Model.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Long>{
	
	List<Feedback> findByCode(String code);
	
	List<Feedback> findAll();
	
	Feedback findById(long id);

}
