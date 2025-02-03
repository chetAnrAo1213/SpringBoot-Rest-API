package com.boot.paginationwithsorting;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class PaginationService 
{

	@Autowired
	PaginationRepo pro;
	
	public List<PaginationModel> inserIntoDB()
	{
	   Iterable<PaginationModel> i = this.pro.findAll();
	   return (List<PaginationModel>)i;
	}
	
	public List<PaginationModel> sortProducts(String field)
	{
		List<PaginationModel> i =this.pro.findAll(Sort.by(Sort.Direction.ASC,field));
		return i;
	}
	
	public Page<PaginationModel> sortProducts(String field,int p1, int size)
	{
		Page<PaginationModel> i =this.pro.findAll(PageRequest.of(p1, size, Sort.by(Direction.ASC,field)));
		return  i;
	}
}
