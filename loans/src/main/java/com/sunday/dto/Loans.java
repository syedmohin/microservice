package com.sunday.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Loans {
	@Id
	@GeneratedValue
	private int id;
	private int loanNumber;
	private LocalDate startDate;
	private String loanType;
	private int totalLoan;
	private int amountLoan;
	private int outstandingAmount;
	private LocalDate createDate;
}
