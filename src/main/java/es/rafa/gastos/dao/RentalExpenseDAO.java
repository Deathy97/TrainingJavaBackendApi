package es.rafa.gastos.dao;

public class RentalExpenseDAO {

	private int id;
	private int expenseTypeId;
	private String expenseTypeName;
	private int rentalId;
	private String rentalName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExpenseTypeId() {
		return expenseTypeId;
	}

	public void setExpenseTypeId(int expenseTypeId) {
		this.expenseTypeId = expenseTypeId;
	}

	public String getExpenseTypeName() {
		return expenseTypeName;
	}

	public void setExpenseTypeName(String expenseTypeName) {
		this.expenseTypeName = expenseTypeName;
	}

	public int getRentalId() {
		return rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public String getRentalName() {
		return rentalName;
	}

	public void setRentalName(String rentalName) {
		this.rentalName = rentalName;
	}

}
