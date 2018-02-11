package com.employeementApp.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.logging.Logger;

import javax.validation.constraints.AssertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.employeeApp.config.BootstrapApplication;
import com.employeeApp.dao.Vehicle;
import com.employeeApp.repository.VehicleDao;
import com.employeeApp.repository.VehicleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=BootstrapApplication.class)
@DataJpaTest
public class AppTest {
	private static final Logger LOGGER = Logger.getLogger(AppTest.class.getName());

	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private VehicleDao vehicleDao;
	
	@Test
	//Repository testing
	public void testCaseScanGoogle() {
		 // given
	    Vehicle vehicle = new Vehicle();
	    vehicle.setMake("Honda");
	    vehicle.setModel("Travera");
	    vehicle.setYear(2018);
	    
	    vehicleDao.addVehicle(vehicle);
	    // when
	    List<Vehicle> found = vehicleRepository.findAll();
	 
	    assertEquals(found.get(0).getMake(),vehicle.getMake());
	}

}
