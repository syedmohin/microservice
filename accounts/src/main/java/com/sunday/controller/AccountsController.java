package com.sunday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sunday.dto.Accounts;
import com.sunday.repo.AccountsRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AccountsController {
	private final AccountsRepository accounts;

	@GetMapping(value = "/{id}")
	public Accounts getAccountsById(@PathVariable("id") Integer id) {
		return accounts
				.findByCustomerId(id)
				.orElse(Accounts.builder().message("No Customer Found With this %d id".formatted(id)).build());
	}
}
