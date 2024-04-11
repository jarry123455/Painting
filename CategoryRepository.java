package com.pant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pant.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	public boolean existsByName(String name);

}
