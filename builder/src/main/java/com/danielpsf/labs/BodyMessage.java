package com.danielpsf.labs;

public class BodyMessage implements Body {
	private String message;
	
	public BodyMessage() { }
	
	public BodyMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
