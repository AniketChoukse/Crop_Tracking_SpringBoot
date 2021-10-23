package com.CropTracking.CropTracking.Service;

import java.util.List;

import com.CropTracking.CropTracking.Entity.State;


public interface IStateService {

	public List<State> getState();
	public State getState(long id);
	public State addState(State state);
	public State updateState(State state);
	public void deleteState(long id);
}
