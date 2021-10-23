package com.CropTracking.CropTracking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CropTracking.CropTracking.Dao.IStateDao;
import com.CropTracking.CropTracking.Entity.State;

@Service
public class StateServiceImpl implements IStateService{

	@Autowired
	private IStateDao stateDao;
	
	@Override
	public List<State> getState() {
		return stateDao.findAll();
	}

	@Override
	public State getState(long id) {
		return stateDao.findById(id).get();
	}

	@Override
	public State addState(State state) {
		stateDao.save(state);
		return state;
	}

	@Override
	public State updateState(State state) {
		stateDao.save(state);
		return state;
	}

	@Override
	public void deleteState(long id) {
		State entity=stateDao.findById(id).get();
		stateDao.delete(entity);
	}

}
