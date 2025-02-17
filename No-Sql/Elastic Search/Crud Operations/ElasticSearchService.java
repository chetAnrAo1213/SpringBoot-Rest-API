package com.boot.elasticSearch;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElasticSearchService
{
	
	@Autowired
	ElasticSearchRepository elr;
	
	public Iterable<ElasticSearchModel> getData()
	{
		return elr.findAll();
	}
	
	public ElasticSearchModel insertRecordData(ElasticSearchModel esm)
	{
		return elr.save(esm);
	}
	
	public ElasticSearchModel updateRecordData(ElasticSearchModel esm,int i)
	{
		ElasticSearchModel existedData = elr.findById(i).get();
		existedData.setName(esm.getName());
		existedData.setPrice(esm.getPrice());
		existedData.setQuantity(esm.getQuantity());
		existedData.setDescription(esm.getDescription());
		return elr.save(existedData);
	}
	
	public ElasticSearchModel deleteRecordData(int i)
	{
		ElasticSearchModel existedData = elr.findById(i).get();
		elr.delete(existedData);
		return existedData;
	}
	
	public ElasticSearchModel getDataById(int i)
	{
		ElasticSearchModel existedData = elr.findById(i).get();
		return existedData;
	}
	
}
