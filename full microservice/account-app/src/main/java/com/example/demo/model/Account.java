package com.example.demo.model;


import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@AllArgsConstructor
@NoArgsConstructor
@Data*/
@Entity
@Table(name = "account_table")
public class Account {
	@Id
	@NotBlank(message = "account number can not be blank")
	@Column(name = "account_number")
	private String accountNumber;
	
	@NotBlank(message = "account holder name can not be blank")
	@Column(name = "account_holder_name")
	@Length(min = 5, max = 16, message = "account holder name is wrong")
	private String accountHolderName;
	
	@Column(name = "account_holder_address")
	private String accountHolderAddress;
	
	@Column(name = "account_holder_email",unique = true)
	@Email(message = "invalid email",regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
	private String accountHolderEmail;
	
	@Column(name = "account_balance")
	@Min(value = 1000, message = "minimum amount required")
	@Max(value = 100000, message = "maximum amount required")
	private double accountBalance;
	
	@Column(name = "min_balance")
	@Min(value = 0 , message = "minimum balance should be greater than zero")
	private double minBalance;

	public Account(@NotBlank(message = "account number can not be blank") String accountNumber,
			@NotBlank(message = "account holder name can not be blank") @Length(min = 5, max = 16, message = "account holder name is wrong") String accountHolderName,
			String accountHolderAddress,
			@Email(message = "invalid email", regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$") String accountHolderEmail,
			@Min(value = 1000, message = "minimum amount required") @Max(value = 100000, message = "maximum amount required") double accountBalance,
			@Min(value = 0, message = "minimum balance should be greater than zero") double minBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.accountHolderEmail = accountHolderEmail;
		this.accountBalance = accountBalance;
		this.minBalance = minBalance;
	}

	public Account() {
		super();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountHolderAddress() {
		return accountHolderAddress;
	}

	public void setAccountHolderAddress(String accountHolderAddress) {
		this.accountHolderAddress = accountHolderAddress;
	}

	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}

	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	
	
	
	
	
	
	
}