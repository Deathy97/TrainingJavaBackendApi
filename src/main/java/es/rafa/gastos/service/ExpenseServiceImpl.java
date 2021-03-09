package es.rafa.gastos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import es.rafa.gastos.dto.ExpenseTypeDTO;
import es.rafa.gastos.mappers.ExpenseTypeMapper;
import es.rafa.gastos.myBatisMapper.MyBatisMapper;

public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private MyBatisMapper databaseMapper;

	@Autowired
	private ExpenseTypeMapper expenseTypeMapper;

	@Override
	public List<ExpenseTypeDTO> getExpenseType() {
		return databaseMapper.getAllExpenseType().stream().map(expenseTypeMapper::toDTO).collect(Collectors.toList());
	}

	@Override
	public int addExpenseType(ExpenseTypeDTO expenseType) {
		return databaseMapper.addExpenseType(expenseTypeMapper.toDAO(expenseType));
	}

}
