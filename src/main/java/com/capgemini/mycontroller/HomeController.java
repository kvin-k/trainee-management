package com.capgemini.mycontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dto.TraineeDetails;
import com.capgemini.service.TraineeService;

@RestController
public class HomeController {

	@Autowired
	TraineeService ts;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody TraineeDetails trainee) {
		ts.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody TraineeDetails trainee) {
		ts.updateTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity deleteData(@RequestBody int tId) {
		ts.deleteTrainee(tId);
		return new ResponseEntity(HttpStatus.OK);
		
	}
	@GetMapping("/getById")
	public TraineeDetails getByTid(@RequestBody int tId) {
		TraineeDetails trainee=ts.getTrainee(tId);
			return trainee;
	}

	@GetMapping("/getAll")
	public ArrayList<TraineeDetails> getAllTrainees(){
		ArrayList<TraineeDetails> trainees = ts.getAllTrainees();
		return trainees;
	}
}
