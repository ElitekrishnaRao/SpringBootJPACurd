package com.employeeApp.convertor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.employeeApp.dao.Vehicle;
import com.employeeApp.model.VehicleDto;

@Component
public class BeanConvertor {
	public  Vehicle dtoToDaoConvertor(VehicleDto vehicleDto){
		Vehicle vehicle= new Vehicle();
		vehicle.setId(vehicleDto.getId());
		vehicle.setMake(vehicleDto.getMake());
		vehicle.setYear(vehicleDto.getYear());
		vehicle.setModel(vehicleDto.getModel());
		return vehicle;
		
	}
	
    public  VehicleDto daoToDtoConvertor(Vehicle vehicle){
    	VehicleDto vehicleDto = new VehicleDto();
    	vehicleDto.setId(vehicle.getId());
    	vehicleDto.setMake(vehicle.getMake());
    	vehicleDto.setYear(vehicle.getYear());
    	vehicleDto.setModel(vehicle.getModel());
		return vehicleDto;
		
	}
    
    public List<VehicleDto> daoListToDtoList(List<Vehicle> vehicleList){
    	List<VehicleDto> vehicleDtoList = new ArrayList<VehicleDto>();
    	 for (Vehicle vehicle : vehicleList) {
    		 vehicleDtoList.add(daoToDtoConvertor(vehicle));
		}
    	 return vehicleDtoList;
    }
	
}
