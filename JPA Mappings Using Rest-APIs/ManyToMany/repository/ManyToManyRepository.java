package com.boot.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.boot.entites.ManyToMany.Customer;

public interface ManyToManyRepository extends CrudRepository<Customer, Integer>
{
}
