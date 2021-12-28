package com.sunday.repo;

import org.springframework.data.repository.CrudRepository;

import com.sunday.dto.Loans;

public interface LoansRepository extends CrudRepository<Loans, Integer> {

}
