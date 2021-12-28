package com.sunday.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonInclude(value = Include.NON_DEFAULT)
public class Accounts {
	@Id
	@JsonIgnore
	@GeneratedValue
	private int id;
	private int customerId;
	private long accountNumber;
	private String accountType;
	private String branchAddess;
	private LocalDate createDt;
	@Transient
	private String message;
}
