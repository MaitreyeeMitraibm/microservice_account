package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString*/
@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception{
	private String message;

	@Override
	public String toString() {
		return "AccountNotFoundException [message=" + message + "]";
	}

	public AccountNotFoundException(String message) {
		super();
		this.message = message;
	}

	public AccountNotFoundException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
