package com.employeeApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeeApp.convertor.BeanConvertor;

import com.employeeApp.model.VehicleDto;
import com.employeeApp.repository.VehicleDao;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	BeanConvertor beanConvertor;
	@Autowired
	VehicleDao vehicleDao;

	@Override
	public void addVehicle(VehicleDto vehicleDto) {
		vehicleDao.addVehicle(beanConvertor.dtoToDaoConvertor(vehicleDto));
	}

}
