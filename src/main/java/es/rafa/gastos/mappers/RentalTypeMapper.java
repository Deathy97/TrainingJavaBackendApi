package es.rafa.gastos.mappers;

import es.rafa.gastos.dao.RentalTypeDAO;
import es.rafa.gastos.dto.RentalTypeDTO;

public class RentalTypeMapper {

	public RentalTypeDAO toDAO(RentalTypeDTO rentType) {
		RentalTypeDAO rentDao = new RentalTypeDAO();
		rentDao.setId(rentType.getId());
		rentDao.setName(rentType.getName());

		return rentDao;

	}

	public RentalTypeDTO toDTO(RentalTypeDAO rentType) {
		RentalTypeDTO rentDto = new RentalTypeDTO();
		rentDto.setId(rentType.getId());
		rentDto.setName(rentType.getName());

		return rentDto;

	}

}
