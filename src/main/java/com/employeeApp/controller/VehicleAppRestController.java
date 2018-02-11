package com.employeeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping("ping")
	public String queryList() {
		return "ServerAlive";
	}

	@RequestMapping(value = "/vehicles", method = RequestMethod.POST)
	public ResponseEntity<String> addVehicle(@RequestBody VehicleDto vehicle) {
		try {
			vehicleService.addVehicle(vehicle);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<String>("Failure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

	@RequestMapping(value = "/vehicles", method = RequestMethod.PUT)
	public ResponseEntity<String> putVehicle(@RequestBody VehicleDto vehicle) {
		try {
			vehicleService.addVehicle(vehicle);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<String>("Failure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

	@RequestMapping(value = "/vehicles/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<VehicleDto>> getVehicle(@PathVariable(value = "id") int id) {
		List<VehicleDto> vehicleDtoList = null;
		try {
			vehicleDtoList = vehicleService.getVehicle(id);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<List<VehicleDto>>(vehicleDtoList, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<VehicleDto>>(vehicleDtoList, HttpStatus.OK);
	}

	@RequestMapping(value = "/vehicles", method = RequestMethod.GET)
	public ResponseEntity<List<VehicleDto>> getVehicle() {
		List<VehicleDto> vehicleDtoList = null;
		try {
			vehicleDtoList = vehicleService.getVehicle(-1);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<List<VehicleDto>>(vehicleDtoList, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<VehicleDto>>(vehicleDtoList, HttpStatus.OK);
	}

	@RequestMapping(value = "/vehicles/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteVehicle(@PathVariable(value = "id") int id) {
		try {
			vehicleService.deleteVehicle(id);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<String>("Success", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}
