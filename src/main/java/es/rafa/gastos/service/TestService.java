package es.rafa.gastos.service;

import java.util.List;
import java.util.Optional;

import es.rafa.gastos.dto.MonthDTO;
import es.rafa.gastos.dto.MonthYearDTO;
import es.rafa.gastos.dto.RentalDTO;
import es.rafa.gastos.dto.RentalExpenseDTO;
import es.rafa.gastos.dto.RentalTypeDTO;
import es.rafa.gastos.dto.YearDTO;

public interface TestService {

	public List<RentalDTO> getAllRents(int rentalType);

	public List<YearDTO> getAllYears();

	public List<MonthYearDTO> getAllMonthsByYear(int yearId);

	public List<MonthDTO> getMonths();

	public Long insertOrUpdateRental(RentalDTO rental);

	public List<RentalTypeDTO> getRentalType();

	public Optional<Integer> insertYearWithRelationMonth(YearDTO year);

	public List<RentalExpenseDTO> getAllRentalExpenses();

	public int addRentalExpense(RentalExpenseDTO rentalExpense);

}
