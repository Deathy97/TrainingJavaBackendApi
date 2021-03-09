package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.MonthYearDAO;
import es.rafa.gastos.dto.MonthYearDTO;

public class MonthByYearMapper {
	public MonthYearDAO toDAO(MonthYearDTO month) {
		MonthYearDAO monthYearDAO = new MonthYearDAO();
		monthYearDAO.setId(month.getId());
		monthYearDAO.setYearId(month.getYearId());
		monthYearDAO.setMonthId(month.getMonthId());
		monthYearDAO.setMonthName(month.getMonthName());

		return monthYearDAO;
	}

	public MonthYearDTO toDTO(MonthYearDAO month) {
		MonthYearDTO monthYearDTO = new MonthYearDTO();
		monthYearDTO.setId(month.getId());
		monthYearDTO.setYearId(month.getYearId());
		monthYearDTO.setMonthId(month.getMonthId());
		monthYearDTO.setMonthName(month.getMonthName());

		return monthYearDTO;
	}
}
