package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.MonthRentalExpenseDAO;
import es.rafa.gastos.dto.MonthRentalExpenseDTO;

public class MonthRentalExpenseMappper {

	public MonthRentalExpenseDTO toDTO(MonthRentalExpenseDAO dao) {
		MonthRentalExpenseDTO dto = new MonthRentalExpenseDTO();
		dto.setId(dao.getId());
		dto.setMonthYearId(dao.getMonthYearId());
		dto.setRentExpenseId(dao.getRentExpenseId());
		dto.setExpenseName(dao.getExpenseName());
		dto.setValue(dao.getValue());

		return dto;
	}

	public MonthRentalExpenseDAO toDAO(MonthRentalExpenseDTO dto) {
		MonthRentalExpenseDAO dao = new MonthRentalExpenseDAO();
		dao.setId(dto.getId());
		dao.setMonthYearId(dto.getMonthYearId());
		dao.setRentExpenseId(dto.getRentExpenseId());
		dao.setExpenseName(dto.getExpenseName());
		dao.setValue(dto.getValue());

		return dao;
	}

}
