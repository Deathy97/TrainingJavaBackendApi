package es.rafa.gastos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.rafa.gastos.dto.ExpenseTypeDTO;
import es.rafa.gastos.service.ExpenseService;

@RestController
@SuppressWarnings("rawtypes")
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;

	@GetMapping("/getExpenseType")
	public ResponseEntity getExpenseType() {

		return new ResponseEntity<>(expenseService.getExpenseType(), HttpStatus.OK);
	}

	@PostMapping("/addExpenseType")
	public ResponseEntity addExpenseType(@RequestBody Optional<ExpenseTypeDTO> expenseType) {
		return new ResponseEntity<>(expenseType.map(expenseService::addExpenseType).orElse(null), HttpStatus.OK);
	}

}
