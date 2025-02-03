package com.boot.paginationwithsorting;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginationController 
{

	@Autowired
	PaginationService pgs;
	
	@GetMapping("/getPag")
	public ResponseEntity<List<PaginationModel>> save() 
	{
		List<PaginationModel> i = this.pgs.inserIntoDB();
		if(i!=null)
			return ResponseEntity.of(Optional.of(i));
		else
			return ResponseEntity.of(Optional.of(i));
	} 

	
	@GetMapping("/getPagSort/{field}")
	public ResponseEntity<List<PaginationModel>> getSort(@PathVariable("field") String field) 
	{
		List<PaginationModel> i = this.pgs.sortProducts(field);
		if(i!=null)
			return ResponseEntity.of(Optional.of(i));
		else
			return ResponseEntity.of(Optional.of(i));
	} 
	
	
	@GetMapping("/getPagSort/{field}/{start}/{ending}")
	public ResponseEntity<Page<PaginationModel>> getSort(@PathVariable("field") String field,@PathVariable("start") int st, @PathVariable("ending")int end) 
	{
		Page<PaginationModel> i = this.pgs.sortProducts(field,st,end);
		if(i!=null)
			return ResponseEntity.of(Optional.of(i));
		else
			return ResponseEntity.of(Optional.of(i));
	} 
}
