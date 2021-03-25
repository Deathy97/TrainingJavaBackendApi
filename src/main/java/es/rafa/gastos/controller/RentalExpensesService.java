package es.rafa.gastos.controller;

import es.rafa.gastos.dto.RentalExpenseDTO;

import java.util.List;

public interface RentalExpensesService {

    List<RentalExpenseDTO> getAllRentalExpenses();

    int addRentalExpense(RentalExpenseDTO rentalExpense);
}
