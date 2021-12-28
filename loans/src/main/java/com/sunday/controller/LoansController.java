package com.sunday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunday.dto.Loans;
import com.sunday.repo.LoansRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class LoansController {
	private final LoansRepository repo;

	@GetMapping("/loans")
	public Iterable<Loans> getLoansDetails() {
		return repo.findAll();
	}
}
