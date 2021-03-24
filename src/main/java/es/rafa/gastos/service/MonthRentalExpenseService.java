package es.rafa.gastos.service;

import java.util.List;

import es.rafa.gastos.dto.MonthRentalExpenseDTO;

public interface MonthRentalExpenseService {

	public List<MonthRentalExpenseDTO> getMonthExpenseByRentId(int rentId);
	
	public int addMonthRental(MonthRentalExpenseDTO monthExpense);
}
