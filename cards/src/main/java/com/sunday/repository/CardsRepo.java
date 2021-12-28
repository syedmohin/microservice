package com.sunday.repository;

import org.springframework.data.repository.CrudRepository;

import com.sunday.dto.Cards;

public interface CardsRepo extends CrudRepository<Cards, Integer> {

}
