package com.boot.elasticSearch;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/noSql/ElasticSearch/")
public class ElasticSearchController 
{
	
	@Autowired
	ElasticSearchService ess;
	
	@GetMapping("/findAll")
	public ResponseEntity<?> getAllProducts()
	{
		Iterable<ElasticSearchModel> data= this.ess.getData();
		return ResponseEntity.of(Optional.of(data));
	}
	
	@PostMapping("/insertRecord")
	public ResponseEntity<?> addRecordIntoData(@RequestBody ElasticSearchModel esm) 
	{
		ElasticSearchModel e1 =	this.ess.insertRecordData(esm);
		return ResponseEntity.of(Optional.of(e1));
	}
	
	@PutMapping("updateRecord/{id}")
	public ResponseEntity<?> updateRecordIntoData(@PathVariable int id, @RequestBody ElasticSearchModel esm) 
	{
		ElasticSearchModel e1 =	this.ess.updateRecordData(esm, id);
		return ResponseEntity.of(Optional.of(e1));
	}
	
	@DeleteMapping("deleteRecord/{id}")
	public ResponseEntity<?> deleteRecordIntoData(@PathVariable int id)
	{
		ElasticSearchModel em = this.ess.deleteRecordData(id);
		return ResponseEntity.of(Optional.of(em));
	}
	
	@GetMapping("findById/{id}")
	public ResponseEntity<?> getRecordFromData(@PathVariable int id)
	{
		ElasticSearchModel em = this.ess.getDataById(id);
		return ResponseEntity.of(Optional.of(em));
	}
	
	
}
