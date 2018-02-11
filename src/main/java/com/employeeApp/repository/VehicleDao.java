package com.employeeApp.repository;

import java.util.List;

import com.employeeApp.dao.Vehicle;
import com.employeeApp.model.VehicleDto;

public interface VehicleDao {
	 public void addVehicle(Vehicle vehicle);
	 public List<VehicleDto> getVehicle(int vehicleId);
	 public void deleteVehicle(int vehicleId);
}
