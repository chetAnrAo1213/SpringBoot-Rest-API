package com.boot.queryhints;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

import jakarta.persistence.QueryHint;

public interface QueryHintsRepo extends JpaRepository<QueryHintsModel, Integer>
{

	@Query("select i from QueryHintsModel i")
	@QueryHints({
		@QueryHint(name="org.hibernate.readOnly",value="true"),
		@QueryHint(name="org.hibernate.fetchSize",value="100"),
		@QueryHint(name="org.hibernate.cachable",value="true"),
		@QueryHint(name="jakarta.persistence.cache.retriveMode",value="USE"),
		@QueryHint(name="jakarta.persistence.cache.storeMode",value="USE"),
		@QueryHint(name="jakarta.persistence.query.timeout",value="2000")
	})
	public List<QueryHintsModel> getAllRecords();
}
