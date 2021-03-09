package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.RentalExpenseDAO;
import es.rafa.gastos.dto.RentalExpenseDTO;

public class RentalExpenseMapper {

	public RentalExpenseDAO toDAO(RentalExpenseDTO dto) {
		RentalExpenseDAO dao = new RentalExpenseDAO();
		dao.setId(dto.getId());
		dao.setExpenseTypeId(dto.getExpenseTypeId());
		dao.setExpenseTypeName(dto.getExpenseTypeName());
		dao.setRentalId(dto.getRentalId());
		dao.setRentalName(dto.getRentalName());

		return dao;
	}

	public RentalExpenseDTO toDTO(RentalExpenseDAO dao) {
		RentalExpenseDTO dto = new RentalExpenseDTO();
		dto.setId(dao.getId());
		dto.setExpenseTypeId(dao.getExpenseTypeId());
		dto.setExpenseTypeName(dao.getExpenseTypeName());
		dto.setRentalId(dao.getRentalId());
		dto.setRentalName(dao.getRentalName());

		return dto;
	}

}
