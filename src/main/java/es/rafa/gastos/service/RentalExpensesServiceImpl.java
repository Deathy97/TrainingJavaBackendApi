package es.rafa.gastos.service;

import es.rafa.gastos.controller.RentalExpensesService;
import es.rafa.gastos.dto.RentalExpenseDTO;
import es.rafa.gastos.mappers.RentalExpenseMapper;
import es.rafa.gastos.myBatisMapper.MyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class RentalExpensesServiceImpl implements RentalExpensesService {

    @Autowired
    private RentalExpenseMapper rentalExpenseMapper;

    @Autowired
    private MyBatisMapper databaseMapper;

    @Override
    public List<RentalExpenseDTO> getAllRentalExpenses() {
        return databaseMapper.getAllRentExpenses()
                .stream()
                .map(rentalExpenseMapper::toDTO)
                .collect(Collectors.toList());

    }

    @Override
    public int addRentalExpense(RentalExpenseDTO expenseDTO) {
        return databaseMapper.addRentalExpense(rentalExpenseMapper.toDAO(expenseDTO));
    }
}
