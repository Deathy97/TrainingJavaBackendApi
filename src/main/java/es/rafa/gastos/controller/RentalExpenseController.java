package es.rafa.gastos.controller;

import es.rafa.gastos.dto.RentalExpenseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RentalExpenseController {


    @Autowired
    RentalExpensesService rentalExpensesService;

	/*
	 	Maybe interfaz funcional para esto testService::getAllRentalExpenses
	 */

    @GetMapping("/getAllRentalExpense")
    public ResponseEntity getRentalExpense() {
        return new ResponseEntity<>(rentalExpensesService.getAllRentalExpenses(), HttpStatus.OK);
    }


    /*
        Tiene sentido pasar el Optional tal cual en estos casos y tratarlo en el Service?
        Si es asi, en el mapper tiene que esperar un Optional.
     */
    @PostMapping("/addRentalExpense")
    public ResponseEntity addRentalExpense(@RequestBody Optional<RentalExpenseDTO> rentalExpense) {

        return new ResponseEntity<>(rentalExpense.map(rentalExpensesService::addRentalExpense), HttpStatus.OK);

    }
}
