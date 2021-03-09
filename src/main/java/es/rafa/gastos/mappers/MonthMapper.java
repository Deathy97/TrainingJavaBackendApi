package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.MonthDAO;
import es.rafa.gastos.dto.MonthDTO;

public class MonthMapper {

	public MonthDAO toDAO(MonthDTO month) {
		MonthDAO monthDAO = new MonthDAO();
		monthDAO.setId(month.getId());
		monthDAO.setName(month.getName());

		return monthDAO;
	}

	public MonthDTO toDTO(MonthDAO month) {
		MonthDTO monthDTO = new MonthDTO();
		monthDTO.setId(month.getId());
		monthDTO.setName(month.getName());

		return monthDTO;
	}

}
