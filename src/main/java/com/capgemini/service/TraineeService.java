package com.capgemini.service;

import java.util.ArrayList;

import com.capgemini.dto.TraineeDetails;

public interface TraineeService {

	public int addTrainee(TraineeDetails trainee);

	public int updateTrainee(TraineeDetails trainee);

	public int deleteTrainee(int tId);

	public ArrayList<TraineeDetails> getAllTrainees();

	public TraineeDetails getTrainee(int tId);
	
}
