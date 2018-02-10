package com.employeeApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class VehicleAppRestController {
	@RequestMapping("list")
	public String queryList() {
		return "hello";
	}
}
