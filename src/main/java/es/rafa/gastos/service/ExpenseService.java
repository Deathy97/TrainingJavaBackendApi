package es.rafa.gastos.service;

import java.util.List;

import es.rafa.gastos.dto.ExpenseTypeDTO;

public interface ExpenseService {

	List<ExpenseTypeDTO> getExpenseType();

	int addExpenseType(ExpenseTypeDTO expenseType);

}
