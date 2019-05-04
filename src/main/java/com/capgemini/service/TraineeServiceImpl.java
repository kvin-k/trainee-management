package com.capgemini.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.TraineeDAO;
import com.capgemini.dto.TraineeDetails;

@Component("ts")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDAO dao;
	

	@Override
	public int addTrainee(TraineeDetails trainee) {
		return dao.addTrainee(trainee);
		// TODO Auto-generated method stub

	}

	@Override
	public int updateTrainee(TraineeDetails trainee) {
		return dao.updateTrainee(trainee);
		// TODO Auto-generated method stub

	}

	@Override
	public int deleteTrainee(int tId) {
		return dao.deleteTrainee(tId);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<TraineeDetails> getAllTrainees() {
		// TODO Auto-generated method stub
		return dao.getAllTrainees();
	}

	@Override
	public TraineeDetails getTrainee(int tId) {
		// TODO Auto-generated method stub
		return dao.getTrainee(tId);
	}

}
