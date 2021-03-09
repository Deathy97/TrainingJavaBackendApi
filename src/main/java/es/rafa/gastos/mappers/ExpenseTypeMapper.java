package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.ExpenseTypeDAO;
import es.rafa.gastos.dto.ExpenseTypeDTO;

public class ExpenseTypeMapper {

	public ExpenseTypeDAO toDAO(ExpenseTypeDTO dto) {
		ExpenseTypeDAO dao = new ExpenseTypeDAO();
		dao.setId(dto.getId());
		dao.setName(dto.getName());

		return dao;

	}

	public ExpenseTypeDTO toDTO(ExpenseTypeDAO dao) {
		ExpenseTypeDTO dto = new ExpenseTypeDTO();
		dto.setId(dao.getId());
		dto.setName(dao.getName());

		return dto;
	}

}
