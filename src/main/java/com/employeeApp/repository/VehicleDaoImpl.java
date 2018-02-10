/**
 * 
 */
package com.employeeApp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeeApp.dao.Vehicle;

/**
 * @author krishna
 *
 */
@Repository
public class VehicleDaoImpl implements VehicleDao {
    @Autowired
	VehicleRepository vehicleRepository;
	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);	
	}

}
