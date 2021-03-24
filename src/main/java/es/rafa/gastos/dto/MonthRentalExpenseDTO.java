package es.rafa.gastos.dto;

public class MonthRentalExpenseDTO {

	private int id;
	private int monthYearId;
	private int rentExpenseId;
	private String expenseName;
	private int value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonthYearId() {
		return monthYearId;
	}

	public void setMonthYearId(int monthYearId) {
		this.monthYearId = monthYearId;
	}

	public int getRentExpenseId() {
		return rentExpenseId;
	}

	public void setRentExpenseId(int rentExpenseId) {
		this.rentExpenseId = rentExpenseId;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
