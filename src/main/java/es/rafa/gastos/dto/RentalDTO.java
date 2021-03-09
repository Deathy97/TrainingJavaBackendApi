package es.rafa.gastos.dto;

import es.rafa.gastos.dao.RentalTypeDAO;

public class RentalDTO {
	private int id;
	private RentalTypeDAO rentalType;
	private String name;
	private int initialValue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RentalTypeDAO getRentalType() {
		return rentalType;
	}

	public void setRentalType(RentalTypeDAO rentalType) {
		this.rentalType = rentalType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}

}
