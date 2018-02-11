package com.employeeApp.exceptions;

public class VehicleStoreException extends Exception {
	private static final long serialVersionUID = 7718828512143293558L;

	public VehicleStoreException() {
		super();
	}

	public VehicleStoreException(String message, Throwable cause) {
		super(message, cause);
	}

	public VehicleStoreException(String message) {
		super(message);
	}

	public VehicleStoreException(Throwable cause) {
		super(cause);
	}
}
