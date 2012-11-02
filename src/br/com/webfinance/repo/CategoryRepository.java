package br.com.webfinance.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.webfinance.model.Category;


@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,String>{

	List<Category> findAll();
	List<Category> findByName(String name);
	List<Category> findBySuperCategory(Category superCategory);
	
}
