package com.boot.mongoDb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MongoDbService 
{
	
	@Autowired
	MongoDbRepo mdr;
	
	public MongoDbModel insertData(MongoDbModel data) 
	{
		MongoDbModel record = this.mdr.save(data);
		return record;
	}
	
	public List<MongoDbModel> findAll() 
	{
		return this.mdr.findAll();
	}
	
	public Optional<MongoDbModel> findById(int id)
	{
		Optional<MongoDbModel> data = this.mdr.findById(id);
		return data;
	}

	public MongoDbModel updateStudent(MongoDbModel m1) 
	{
		MongoDbModel updatedData = this.mdr.save(m1);
		return updatedData;
	}
	
	public void deleteStudent(int id) 
	{
		 this.mdr.deleteById(id);
	}
	
}