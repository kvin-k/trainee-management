package com.capgemini.dao;

import java.util.ArrayList;

import com.capgemini.dto.TraineeDetails;

public interface TraineeDAO {

	public int addTrainee(TraineeDetails trainee);

	public int updateTrainee(TraineeDetails trainee);

	public int deleteTrainee(int tId);

	public ArrayList<TraineeDetails> getAllTrainees();

	public TraineeDetails getTrainee(int tId);
	
}
