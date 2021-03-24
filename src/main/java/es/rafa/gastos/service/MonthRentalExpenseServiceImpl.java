package es.rafa.gastos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import es.rafa.gastos.dto.MonthRentalExpenseDTO;
import es.rafa.gastos.mappers.MonthRentalExpenseMappper;
import es.rafa.gastos.myBatisMapper.MyBatisMapper;

public class MonthRentalExpenseServiceImpl implements MonthRentalExpenseService {

	@Autowired
	MyBatisMapper databaseMapper;

	@Autowired
	MonthRentalExpenseMappper monthRentalExpenseMapper;

	@Override
	public List<MonthRentalExpenseDTO> getMonthExpenseByRentId(int rentalId) {
		return databaseMapper.getMonthExpenseByRentId(rentalId).stream().map(monthRentalExpenseMapper::toDTO)
				.collect(Collectors.toList());
	}

	@Override
	public int addMonthRental(MonthRentalExpenseDTO monthExpense) {
		return databaseMapper.addMonthExpense(monthRentalExpenseMapper.toDAO(monthExpense));
	}

}
