package es.rafa.gastos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.rafa.gastos.mappers.ExpenseTypeMapper;
import es.rafa.gastos.mappers.MonthByYearMapper;
import es.rafa.gastos.mappers.MonthMapper;
import es.rafa.gastos.mappers.RentMapper;
import es.rafa.gastos.mappers.RentalExpenseMapper;
import es.rafa.gastos.mappers.RentalTypeMapper;
import es.rafa.gastos.mappers.YearMapper;
import es.rafa.gastos.service.ExpenseService;
import es.rafa.gastos.service.ExpenseServiceImpl;
import es.rafa.gastos.service.TestService;
import es.rafa.gastos.service.TestServiceImpl;

@Configuration
public class Config {

	@Bean
	public TestService getTestService() {
		return new TestServiceImpl();
	}

	@Bean
	public ExpenseService getExpenseService() {
		return new ExpenseServiceImpl();
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

}
