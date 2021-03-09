package es.rafa.gastos.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.rafa.gastos.dto.RentalDTO;
import es.rafa.gastos.dto.RentalExpenseDTO;
import es.rafa.gastos.service.TestService;

@RestController
@SuppressWarnings("rawtypes")
public class RentalController {

	@Autowired
	TestService testService;

	@GetMapping("/getRentals")
	public ResponseEntity getPisos(Optional<Integer> rentalType) {
		return new ResponseEntity<>(rentalType.map(testService::getAllRents).orElse(new ArrayList<>()), HttpStatus.OK);
	}

	@PostMapping("/addRental")
	public ResponseEntity addRental(@RequestBody Optional<RentalDTO> rental) {
		return new ResponseEntity<>(rental.map(testService::insertOrUpdateRental), HttpStatus.OK);
	}
	
	/*
	 	Maybe interfaz funcional para esto testService::getRentalType
	 */

	@GetMapping("/getRentalType")
	public ResponseEntity getRentalType() {
		return new ResponseEntity<>(testService.getRentalType(), HttpStatus.OK);
	}

	
	//TODO:  los *Expense tienen que ir en un controller a parte, toca refactorizar
	
	
	/*
	 	Maybe interfaz funcional para esto testService::getAllRentalExpenses
	 */
	
	@GetMapping("/getAllRentalExpense")
	public ResponseEntity getRentalExpense() {
		return new ResponseEntity<>(testService.getAllRentalExpenses(), HttpStatus.OK);
	}

	
	/*
		Tiene sentido pasar el Optional tal cual en estos casos y tratarlo en el Service?
		Si es asi, en el mapper tiene que esperar un Optional.
	 */
	@PostMapping("/addRentalExpense")
	public ResponseEntity addRentalExpense(@RequestBody Optional<RentalExpenseDTO> rentalExpense) {

		return new ResponseEntity<>(rentalExpense.map(testService::addRentalExpense), HttpStatus.OK);

	}
	
}
