package com.parkingsystem.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parkingsys.service.ParkingService;
import com.parkingsystem.domain.AddFloor;
import com.parkingsystem.domain.ParkingData;

@RestController
@RequestMapping("parking-system")
public class Kontroller {

	@Autowired
	private ParkingService parkingService;
	
	@RequestMapping(value = "add", method = RequestMethod.POST ,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addFloor(@RequestBody AddFloor addFloor) throws Exception {
		return parkingService.addLevel(addFloor.getNo_Bikes(), addFloor.getNo_Cars(), addFloor.getNo_Hvs());
	}
	
	@RequestMapping(value = "list", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Object overview() throws Exception {
		return parkingService.getOverview();
	}
	
	@RequestMapping(value = "availabilty", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HashMap<Integer, List> availabiltyCheck() throws Exception {
		return parkingService.availabilty();
	}
	
	@RequestMapping(value = "park", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean park(@RequestBody ParkingData parkingData) throws Exception {
		return parkingService.manage_Parking(parkingData.getFloor_no(), parkingData.getParking_bay(), parkingData.getVehice_reg_no(), parkingData.getVehicle_type(), true);
	}
	
	@RequestMapping(value = "unpark", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean unpark(@RequestBody ParkingData parkingData) throws Exception {
		return parkingService.manage_Parking(parkingData.getFloor_no(), parkingData.getParking_bay(), parkingData.getVehice_reg_no(), parkingData.getVehicle_type(), false);
	}
	
	@RequestMapping(value = "locate" , method =  RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
	public  List locateVehicle(@RequestBody String vehicle_reg_no) throws Exception {
		return parkingService.locateVehcile(vehicle_reg_no);
	}
	
	@RequestMapping(value = "remove" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean remove() throws Exception {
		return parkingService.remove();
	}
}
