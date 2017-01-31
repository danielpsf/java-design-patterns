package com.danielpsf.labs;

public class MyHttpRequest {

	private String method;
	private Body body;

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Body getBody() {
		return this.body;
	}
}
