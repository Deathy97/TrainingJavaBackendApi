package es.rafa.gastos.service;

import es.rafa.gastos.dto.*;

import java.util.List;
import java.util.Optional;

public interface TestService {

	List<RentalDTO> getAllRents(int rentalType);

	List<YearDTO> getAllYears();

	List<MonthYearDTO> getAllMonthsByYear(int yearId);

	List<MonthDTO> getMonths();

	Long insertOrUpdateRental(RentalDTO rental);

	List<RentalTypeDTO> getRentalType();

	Optional<Integer> insertYearWithRelationMonth(YearDTO year);

}
