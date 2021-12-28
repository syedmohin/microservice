package com.sunday.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sunday.dto.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Integer> {
	
	Optional<Accounts> findByCustomerId(int customerId);
}
