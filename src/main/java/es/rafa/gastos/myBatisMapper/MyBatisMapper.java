package es.rafa.gastos.myBatisMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import es.rafa.gastos.dao.ExpenseTypeDAO;
import es.rafa.gastos.dao.MonthDAO;
import es.rafa.gastos.dao.MonthYearDAO;
import es.rafa.gastos.dao.RentalDAO;
import es.rafa.gastos.dao.RentalExpenseDAO;
import es.rafa.gastos.dao.RentalTypeDAO;
import es.rafa.gastos.dao.YearDAO;

@Mapper
public interface MyBatisMapper {

	public List<RentalDAO> getAllRents(int rentalType);

	public List<YearDAO> getAllYears();

	public List<MonthYearDAO> getAllMonthsByYear(int yearId);

	public List<MonthDAO> getMonths();

	public Long insertOrUpdateRental(RentalDAO rental);

	public List<RentalTypeDAO> getRentalType();

	public int insertYear(YearDAO year);

	public int insertYearWithRelationMonth(int yearId);

	public List<ExpenseTypeDAO> getAllExpenseType();

	public int addExpenseType(ExpenseTypeDAO expense);

	public List<RentalExpenseDAO> getAllRentExpenses();

	public int addRentalExpense(RentalExpenseDAO expenseDAO);

}
