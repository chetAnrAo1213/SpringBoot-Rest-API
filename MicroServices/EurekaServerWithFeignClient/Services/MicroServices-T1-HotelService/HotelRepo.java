package com.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entities.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, String>
{
	@Query("select i from Hotel i where i.id=:x")
	public Hotel getById(@Param("x") String id);
}
