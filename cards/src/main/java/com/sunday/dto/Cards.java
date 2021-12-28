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
@NoArgsConstructor
@AllArgsConstructor
public class Cards {
	@Id
	@GeneratedValue
	private int id;
	private int cardId;
	private int cardNumber;
	private String cardType;
	private int totalLimit;
	private String amountUsed;
	private int availableAmount;
	private LocalDate createDate;
}
