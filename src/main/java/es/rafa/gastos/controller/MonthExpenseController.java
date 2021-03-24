package es.rafa.gastos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.rafa.gastos.dto.MonthRentalExpenseDTO;
import es.rafa.gastos.service.MonthRentalExpenseService;

@RestController
@SuppressWarnings("rawtypes")
public class MonthExpenseController {

	@Autowired
	MonthRentalExpenseService monthRentalExpenseService;

	@GetMapping("/getMonthExpenseByRentId")
	public ResponseEntity getMonthExpenseByRentId(Optional<Integer> rentalId) {
		return new ResponseEntity<>(rentalId.map(monthRentalExpenseService::getMonthExpenseByRentId), HttpStatus.OK);
	}

	@PostMapping("/addMonthRentalExpense")
	public ResponseEntity addMonthRentalExpense(@RequestBody Optional<MonthRentalExpenseDTO> monthRentalExpense) {
		return new ResponseEntity<>(monthRentalExpense.map(monthRentalExpenseService::addMonthRental), HttpStatus.OK);
	}

}
