package com.employeeApp.service;

import java.util.List;

import com.employeeApp.model.VehicleDto;

public interface VehicleService {
	public void addVehicle(VehicleDto vehicle);
	public List<VehicleDto> getVehicle(int vehicleId);
	public void deleteVehicle(int vehicleId);
}
