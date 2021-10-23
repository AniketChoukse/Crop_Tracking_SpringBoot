package com.CropTracking.CropTracking.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CropTracking.CropTracking.Entity.State;

@Controller
@RequestMapping("/state")
@CrossOrigin("*")
public interface IStateController {
	
	@GetMapping("/getState")
	public List<State> getState();
	
	@GetMapping("/findById/{stateid_pk}")
	public State getState(@PathVariable("stateid_pk") String id);
	
	@PostMapping("/save")
	public State addState(@RequestBody State state);
	
	@PutMapping("/update")
	public State updateState(@RequestBody State state);
	
	@DeleteMapping("/delete/{addressid_pk}")
	public ResponseEntity<HttpStatus> deleteState(@PathVariable String id);
}
