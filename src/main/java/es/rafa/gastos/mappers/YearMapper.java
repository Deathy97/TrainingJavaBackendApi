package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.YearDAO;
import es.rafa.gastos.dto.YearDTO;

public class YearMapper {

	public YearDAO toDAO(YearDTO year) {
		YearDAO yearDAO = new YearDAO();
		yearDAO.setId(year.getId());
		yearDAO.setNumber(year.getNumber());
		
		return yearDAO;
	}
	
	public YearDTO toDTO(YearDAO year) {
		YearDTO yearDTO = new YearDTO();
		yearDTO.setId(year.getId());
		yearDTO.setNumber(year.getNumber());
		
		return yearDTO;
	}
}
