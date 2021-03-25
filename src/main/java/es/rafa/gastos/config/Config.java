package es.rafa.gastos.config;

import es.rafa.gastos.controller.RentalExpensesService;
import es.rafa.gastos.mappers.*;
import es.rafa.gastos.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public TestService getTestService() {
		return new TestServiceImpl();
	}

	@Bean
	public RentalExpensesService getRentalExpensesService() {
		return new RentalExpensesServiceImpl();
	}

	@Bean
	public ExpenseService getExpenseService() {
		return new ExpenseServiceImpl();
	}

	@Bean
	public MonthRentalExpenseService getMonthExpenseSevice() {
		return new MonthRentalExpenseServiceImpl();
	}

	@Bean
	public RentMapper getPisosMapper() {
		return new RentMapper();
	}

	@Bean
	public YearMapper getYearMapper() {
		return new YearMapper();
	}

	@Bean
	public MonthByYearMapper getMonthByYearMapper() {
		return new MonthByYearMapper();
	}

	@Bean
	public MonthMapper getMonthMapper() {
		return new MonthMapper();
	}

	@Bean
	public RentalTypeMapper getRentalTypeMapper() {
		return new RentalTypeMapper();
	}

	@Bean
	public ExpenseTypeMapper getExpenseTypeMapper() {
		return new ExpenseTypeMapper();
	}

	@Bean
	public RentalExpenseMapper getRentalExpenseMapper() {
		return new RentalExpenseMapper();
	}

	@Bean
	public MonthRentalExpenseMappper getMonthExpenseMappper() {
		return new MonthRentalExpenseMappper();
	}
}
