package com.boot.mongoDb;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noSql")
public class MongoDbController 
{
	
	@Autowired
	MongoDbService mds;
	
	@PostMapping("/insertDocument")
	public ResponseEntity<?> addStudent(@RequestBody MongoDbModel m1)
	{
		MongoDbModel data =  this.mds.insertData(m1);
		return ResponseEntity.of(Optional.of(data));
	}
	
	@GetMapping("/selectAllDocuments")
	public ResponseEntity<?> getStudents()
	{
	  List<MongoDbModel> data = this.mds.findAll();	
	  return ResponseEntity.of(Optional.of(data));
	}
	
	@GetMapping("/selectDocument/{id}")
	public ResponseEntity<?> getStudent(@PathVariable("id") int id)
	{
	  Optional<MongoDbModel> data = this.mds.findById(id);
	  return ResponseEntity.of(Optional.of(data));
	}
	
	@PutMapping("/updateDocument/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody MongoDbModel m1) 
	{
		Optional<MongoDbModel> data = this.mds.findById(id);
		if(!Objects.isNull(data))
		{
			MongoDbModel updateddata = this.mds.updateStudent(m1);
			return ResponseEntity.of(Optional.of(updateddata));
		}
		else
			return ResponseEntity.of(Optional.of(data));
	}
	
	@DeleteMapping("/deleteDocument/{id}")
	public ResponseEntity<?> deleteDocument(@PathVariable("id") int id)
	{
		Optional<MongoDbModel> data = this.mds.findById(id);
		if(!Objects.isNull(data))
		{
			this.mds.deleteStudent(id);
			return ResponseEntity.of(Optional.of(200));
		}
		else
			return ResponseEntity.of(Optional.of(data));
	}
	
}
