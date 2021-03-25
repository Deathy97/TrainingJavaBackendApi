package es.rafa.gastos.service;

import es.rafa.gastos.dao.YearDAO;
import es.rafa.gastos.dto.*;
import es.rafa.gastos.mappers.*;
import es.rafa.gastos.myBatisMapper.MyBatisMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Optional.empty;
import static java.util.Optional.of;

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

        if (insertYear != 1) {
            return empty();
        }

        return of(databaseMapper.insertYearWithRelationMonth(yearDAO.getId()));

    }
}
