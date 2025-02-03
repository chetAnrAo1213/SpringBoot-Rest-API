package com.boot.compositePrimaryKey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompositeKeyRepo extends JpaRepository<EmployeeModel, EmployeePrimaryKeys>
{
	
}