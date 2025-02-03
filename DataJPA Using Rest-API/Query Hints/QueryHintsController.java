package com.boot.queryhints;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/QueryHints")
public class QueryHintsController 
{
	
	@Autowired
	private QueryHintsService qhs;

	@GetMapping("/findall")
	public ResponseEntity<List<QueryHintsModel>> selectAll()
	{
		List<QueryHintsModel> l1 = this.qhs.getAll();
		return ResponseEntity.of(Optional.of(l1));
	}
}
 