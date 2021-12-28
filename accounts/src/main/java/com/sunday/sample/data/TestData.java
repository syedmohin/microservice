package com.sunday.sample.data;

import static java.time.LocalDate.now;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sunday.dto.Accounts;
import com.sunday.repo.AccountsRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestData implements CommandLineRunner {
	private final AccountsRepository repo;

	@Override
	public void run(String... args) throws Exception {
		var acc1 = Accounts
				.builder()
				.accountNumber(111)
				.accountType("savings")
				.branchAddess("HYD")
				.createDt(now())
				.customerId(1)
				.build();
		var acc2 = Accounts
				.builder()
				.accountNumber(222)
				.accountType("current")
				.branchAddess("HYD")
				.createDt(now())
				.customerId(2)
				.build();
		var acc3 = Accounts
				.builder()
				.accountNumber(333)
				.accountType("savings")
				.branchAddess("HYD")
				.createDt(now())
				.customerId(3)
				.build();
		var acc4 = Accounts
				.builder()
				.accountNumber(444)
				.accountType("current")
				.branchAddess("HYD")
				.createDt(now())
				.customerId(4)
				.build();
		var acc5 = Accounts
				.builder()
				.accountNumber(555)
				.accountType("savings")
				.branchAddess("HYD")
				.createDt(now())
				.customerId(5)
				.build();
		var acc6 = Accounts
				.builder()
				.accountNumber(666)
				.accountType("current")
				.branchAddess("HYD")
				.createDt(now())
				.customerId(6)
				.build();
		repo.deleteAll();
		repo.saveAll(List.of(acc1, acc2, acc3, acc4, acc5, acc6));
	}

}
