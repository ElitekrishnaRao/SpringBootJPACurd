package com.employeeApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeApp.dao.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	List<Vehicle> findById(int vehicleId);
}
