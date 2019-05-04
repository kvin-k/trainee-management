package com.capgemini.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capgemini.dto.TraineeDetails;

@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeDAOImpl implements TraineeDAO {


	@PersistenceContext
	EntityManager entityManager;

	@Override
	public int addTrainee(TraineeDetails trainee) {
		entityManager.persist(trainee);
		return 0;
		

	}

	@Override
	public int updateTrainee(TraineeDetails trainee) {
		entityManager.merge(trainee);
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public int deleteTrainee(int tId) {
		TraineeDetails tr =new TraineeDetails();
		tr.settId(tId);
		entityManager.remove(getTrainee(tId));
		return 0;
		
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<TraineeDetails> getAllTrainees() {
		Query query = (Query) entityManager.createQuery("from TraineeDetails");
		ArrayList<TraineeDetails> list = (ArrayList<TraineeDetails>) query.list();
		return list;
	}

	@Override
	public TraineeDetails getTrainee(int tId) {
		TraineeDetails t=entityManager.find(TraineeDetails.class, tId);
		return t;
	}

}
