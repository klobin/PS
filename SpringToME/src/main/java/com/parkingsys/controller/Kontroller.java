package com.parkingsys.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parkingsys.domain.AddFloor;
import com.parkingsys.domain.ParkingData;

@RestController
@RequestMapping("parking-system")
public class Kontroller {

	@RequestMapping(value = "add", method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addFloor(@RequestBody AddFloor addFloor) throws Exception {
		// Contract Service Interface call
		return false;
	}
	
	@RequestMapping(value = "list", method = RequestMethod.POST)/*, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)*/
	public Object overview() throws Exception {
		System.out.println("Heloo");
		// Contract Service Interface call
		return "Hello";
	}
	
	@RequestMapping(value = "availabilty", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<Integer, List<Object>> availabiltyCheck() throws Exception {
		// Contract Service Interface call
		return null;
	}
	
	@RequestMapping(value = "park", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean park(@RequestBody ParkingData parkingData) throws Exception {
		// Contract Service Interface call
		return false;
	}
	
	@RequestMapping(value = "unpark", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean unpark(@RequestBody ParkingData parkingData) throws Exception {
		// Contract Service Interface call
		return false;
	}
	
	@RequestMapping(value = "locate" , method =  RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public  Object locateVehicle() throws Exception {
		// Contract Service Interface call
		return null;
	}
	
	@RequestMapping(value = "remove" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean remove() throws Exception {
		// Contract Service Interface call
		return false;
	}
}
