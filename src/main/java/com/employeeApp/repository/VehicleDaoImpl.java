/***
 * 
 */
package com.employeeApp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeeApp.convertor.BeanConvertor;
import com.employeeApp.dao.Vehicle;
import com.employeeApp.model.VehicleDto;

/**
 * @author krishna
 *
 */
@Repository
public class VehicleDaoImpl implements VehicleDao {
	@Autowired
	BeanConvertor beanConvertor;
    @Autowired
	VehicleRepository vehicleRepository;
	@Override
	public void addVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);	
	}
	@Override
	public List<VehicleDto> getVehicle(int vehicleId) {
		  if(vehicleId!=-1){
			 return beanConvertor.daoListToDtoList(vehicleRepository.findById(vehicleId));
		  }else{
			  return beanConvertor.daoListToDtoList(vehicleRepository.findAll());
		  }
	}
	@Override
	public void deleteVehicle(int vehicleId) {
		vehicleRepository.delete(vehicleId);;
	}

}
