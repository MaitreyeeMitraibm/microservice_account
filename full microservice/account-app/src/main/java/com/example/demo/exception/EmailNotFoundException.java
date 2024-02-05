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
public class EmailNotFoundException extends Exception {
	private String message;

	public EmailNotFoundException(String message) {
		super();
		this.message = message;
	}

	public EmailNotFoundException() {
		super();
	}

	@Override
	public String toString() {
		return "EmailNotFoundException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
