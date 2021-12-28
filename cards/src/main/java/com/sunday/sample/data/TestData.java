package com.sunday.sample.data;

import static java.time.LocalDate.now;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sunday.dto.Cards;
import com.sunday.repository.CardsRepo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestData implements CommandLineRunner {

	private final CardsRepo repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		var c1 = Cards
				.builder()
				.amountUsed("S")
				.availableAmount(10000)
				.cardId(1)
				.cardNumber(000)
				.cardType("P")
				.createDate(now())
				.totalLimit(1200)
				.build();
		var c2 = Cards
				.builder()
				.amountUsed("C")
				.availableAmount(10000)
				.cardId(1)
				.cardNumber(111)
				.cardType("P")
				.createDate(now())
				.totalLimit(1200)
				.build();
		var c3 = Cards
				.builder()
				.amountUsed("S")
				.availableAmount(10000)
				.cardId(1)
				.cardNumber(222)
				.cardType("P")
				.createDate(now())
				.totalLimit(1200)
				.build();
		var c4 = Cards
				.builder()
				.amountUsed("C")
				.availableAmount(10000)
				.cardId(1)
				.cardNumber(333)
				.cardType("P")
				.createDate(now())
				.totalLimit(1200)
				.build();
		var c5 = Cards
				.builder()
				.amountUsed("S")
				.availableAmount(10000)
				.cardId(1)
				.cardNumber(444)
				.cardType("P")
				.createDate(now())
				.totalLimit(1200)
				.build();
		var c6 = Cards
				.builder()
				.amountUsed("C")
				.availableAmount(10000)
				.cardId(1)
				.cardNumber(555)
				.cardType("P")
				.createDate(now())
				.totalLimit(1200)
				.build();
		repo.saveAll(List.of(c1, c2, c3, c4, c5, c6));

	}

}
