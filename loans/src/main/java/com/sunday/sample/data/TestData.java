package com.sunday.sample.data;

import static java.time.LocalDate.now;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sunday.dto.Loans;
import com.sunday.repo.LoansRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestData implements CommandLineRunner {
	private final LoansRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		var l1 = Loans
				.builder()
				.amountLoan(10000)
				.createDate(now())
				.loanNumber(1)
				.loanType("edu")
				.outstandingAmount(120)
				.startDate(now())
				.totalLoan(10)
				.build();
		var l2 = Loans
				.builder()
				.amountLoan(12000)
				.createDate(now())
				.loanNumber(2)
				.loanType("edu")
				.outstandingAmount(120)
				.startDate(now())
				.totalLoan(10)
				.build();
		var l3 = Loans
				.builder()
				.amountLoan(14000)
				.createDate(now())
				.loanNumber(3)
				.loanType("bike")
				.outstandingAmount(120)
				.startDate(now())
				.totalLoan(10)
				.build();
		var l4 = Loans
				.builder()
				.amountLoan(16000)
				.createDate(now())
				.loanNumber(4)
				.loanType("edu")
				.outstandingAmount(120)
				.startDate(now())
				.totalLoan(10)
				.build();
		var l5 = Loans
				.builder()
				.amountLoan(18000)
				.createDate(now())
				.loanNumber(5)
				.loanType("car")
				.outstandingAmount(120)
				.startDate(now())
				.totalLoan(10)
				.build();
		repo.saveAll(List.of(l1, l2, l3, l4, l5));
	}

}
