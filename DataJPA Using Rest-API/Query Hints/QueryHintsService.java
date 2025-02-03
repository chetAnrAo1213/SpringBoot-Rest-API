package com.boot.queryhints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryHintsService 
{
	@Autowired
	QueryHintsRepo qhp;
	
	public List<QueryHintsModel> getAll()
	{
		Iterable<QueryHintsModel> q=  this.qhp.getAllRecords();
		//System.out.println(q);
		return (List<QueryHintsModel>) q;
	}
}
