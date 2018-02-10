package com.employeeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeeApp.model.VehicleDto;
import com.employeeApp.service.VehicleService;

@RestController
@RequestMapping("/rest")
public class VehicleAppRestController {
    @Autowired
	VehicleService vehicleService;
	
	@RequestMapping("list")
	public String queryList() {
		return "hello";
	}
	
	@RequestMapping(value ="/vehicles", method = RequestMethod.POST)
	public void addVehicle( @RequestBody VehicleDto vehicle) {
		vehicleService.addVehicle(vehicle);
	}
}
