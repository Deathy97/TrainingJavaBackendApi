package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.RentalDAO;
import es.rafa.gastos.dto.RentalDTO;

public class RentMapper {

	public RentalDAO toDAO(RentalDTO rent) {
		RentalDAO rentDao = new RentalDAO();
		rentDao.setId(rent.getId());
		rentDao.setName(rent.getName());
		rentDao.setRentalType(rent.getRentalType());
		rentDao.setInitialValue(rent.getInitialValue());

		return rentDao;

	}
	
	public RentalDTO toDTO(RentalDAO rent) {
		RentalDTO rentDto = new RentalDTO();
		rentDto.setName(rent.getName());
		rentDto.setRentalType(rent.getRentalType());
		rentDto.setInitialValue(rent.getInitialValue());

		return rentDto;

	}

}
