package com.danielpsf.labs;

public class MyHttpRequestBuilder {
	private MyHttpRequest request;
	
	public MyHttpRequestBuilder() {
		this.request = new MyHttpRequest();
	}

	public MyHttpRequestBuilder withMethod(String method) {
		request.setMethod(method);
		return this;
	}

	public MyHttpRequest build() {
		return request;
	}

	public MyHttpRequestBuilder withBody(Body body) {
		request.setBody(body);
		return this;
	}

}
