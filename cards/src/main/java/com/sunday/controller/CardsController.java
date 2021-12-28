package com.sunday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunday.dto.Cards;
import com.sunday.repository.CardsRepo;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CardsController {
	private final CardsRepo repo;

	@GetMapping("/cards")
	public Iterable<Cards> getAllCards() {
		return repo.findAll();
	}
}
