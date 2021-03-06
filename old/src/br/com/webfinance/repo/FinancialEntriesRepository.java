package br.com.webfinance.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.webfinance.model.Budget;
import br.com.webfinance.model.FinancialEntry;
import br.com.webfinance.model.UserAccount;


@Repository
public interface FinancialEntriesRepository extends PagingAndSortingRepository<FinancialEntry,String>{

	List<FinancialEntry> findAll();
	List<FinancialEntry> findByBudget(Budget budget);

	
}
