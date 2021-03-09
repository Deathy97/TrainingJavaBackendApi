package es.rafa.gastos.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import es.rafa.gastos.dao.YearDAO;
import es.rafa.gastos.dto.MonthDTO;
import es.rafa.gastos.dto.MonthYearDTO;
import es.rafa.gastos.dto.RentalDTO;
import es.rafa.gastos.dto.RentalExpenseDTO;
import es.rafa.gastos.dto.RentalTypeDTO;
import es.rafa.gastos.dto.YearDTO;
import es.rafa.gastos.mappers.MonthByYearMapper;
import es.rafa.gastos.mappers.MonthMapper;
import es.rafa.gastos.mappers.RentMapper;
import es.rafa.gastos.mappers.RentalExpenseMapper;
import es.rafa.gastos.mappers.RentalTypeMapper;
import es.rafa.gastos.mappers.YearMapper;
import es.rafa.gastos.myBatisMapper.MyBatisMapper;

public class TestServiceImpl implements TestService {

	@Autowired
	private YearMapper yearMapper;

	@Autowired
	private RentMapper pisosMapper;

	@Autowired
	private RentalTypeMapper rentalTypeMapper;

	@Autowired
	private MonthMapper monthMapper;

	@Autowired
	private MonthByYearMapper monthByYearMapper;

	@Autowired
	private RentalExpenseMapper rentalExpenseMapper;

	@Autowired
	private MyBatisMapper databaseMapper;

	@Override
	public List<RentalDTO> getAllRents(int rentalType) {
		return databaseMapper.getAllRents(rentalType)
				.stream()
				.map(pisosMapper::toDTO)
				.collect(Collectors.toList());

	}

	@Override
	public List<YearDTO> getAllYears() {
		return databaseMapper.getAllYears()
				.stream()
				.map(yearMapper::toDTO)
				.collect(Collectors.toList());
	}

	@Override
	public List<MonthYearDTO> getAllMonthsByYear(int yearId) {
		return databaseMapper.getAllMonthsByYear(yearId)
				.stream()
				.map(monthByYearMapper::toDTO)
				.collect(Collectors.toList());
	}

	@Override
	public List<MonthDTO> getMonths() {
		return databaseMapper.getMonths()
				.stream()
				.map(monthMapper::toDTO)
				.collect(Collectors.toList());
	}

	@Override
	public Long insertOrUpdateRental(RentalDTO rental) {
		return databaseMapper.insertOrUpdateRental(pisosMapper.toDAO(rental));
	}

	@Override
	public List<RentalTypeDTO> getRentalType() {
		return databaseMapper.getRentalType()
				.stream()
				.map(rentalTypeMapper::toDTO)
				.collect(Collectors.toList());
	}

	@Override
	public Optional<Integer> insertYearWithRelationMonth(YearDTO year) {
		YearDAO yearDAO = yearMapper.toDAO(year);
		int insertYear = databaseMapper.insertYear(yearDAO);

		if (Objects.isNull(insertYear)) {
			return Optional.empty();
		}

		return Optional.of(databaseMapper.insertYearWithRelationMonth(yearDAO.getId()));

	}

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
