package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.State;
import com.CropTracking.CropTracking.Service.IStateService;

@RestController
public class StateControllerImpl implements IStateController{

	@Autowired
	private IStateService stateService;
	
	@Override
	public List<State> getState() {
		return this.stateService.getState();
	}

	@Override
	public State getState(String id) {
		return this.stateService.getState(Long.parseLong(id));
	}

	@Override
	public State addState(State state) {
		return this.stateService.addState(state);
	}

	@Override
	public State updateState(State state) {
		return this.stateService.updateState(state);
	}

	@Override
	public ResponseEntity<HttpStatus> deleteState(String id) {
		try {
			this.stateService.deleteState(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
