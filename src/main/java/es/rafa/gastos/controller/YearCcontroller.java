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

import es.rafa.gastos.dto.YearDTO;
import es.rafa.gastos.service.TestService;


@RestController
@SuppressWarnings("rawtypes")
public class YearCcontroller {

	@Autowired
	TestService testService;

	@GetMapping("/getYears")
	public ResponseEntity getYears() {
		return new ResponseEntity<>(testService.getAllYears(), HttpStatus.OK);
	}

	@GetMapping("/getMonths")
	public ResponseEntity getMonths() {
		return new ResponseEntity<>(testService.getMonths(), HttpStatus.OK);

	}

	@GetMapping("/getMonthsByYear")
	public ResponseEntity getMonths(Optional<Integer> yearId) {
		return new ResponseEntity<>(yearId.map(testService::getAllMonthsByYear).orElse(new ArrayList<>()),
				HttpStatus.OK);
	}
	
	@PostMapping("/insertYear")
	public ResponseEntity insertYear(@RequestBody Optional<YearDTO> year) {
		return new ResponseEntity<>(year.map(testService::insertYearWithRelationMonth).orElse(null), HttpStatus.OK);
	}

}
