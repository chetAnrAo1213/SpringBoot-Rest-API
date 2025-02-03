package com.boot.compositePrimaryKey;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompositeKeyController 
{
	
	@Autowired
	CompositeKeyService cks;
	
	@PostMapping("/CompositeSave")
	public ResponseEntity<EmployeeModel> save(@RequestBody EmployeeModel emp)
	{
		try {
		EmployeeModel e = this.cks.insert(emp);
		return ResponseEntity.of(Optional.of(e));
		}
		catch (Exception e) {
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/CompositeGet")
	public ResponseEntity<List<EmployeeModel>> get() 
	{
		try {
			List<EmployeeModel> i = this.cks.select();
			return ResponseEntity.of(Optional.of(i));
			}
			catch (Exception e) {
				return ResponseEntity.status(500).build();
			}
	}
	
}
