package com.danielpsf.labs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.ws.rs.HttpMethod;

import org.junit.Test;

public class BuilderSpec {

	@Test
	public void should_build_a_http_with_method() {
		MyHttpRequest request = new MyHttpRequestBuilder().withMethod(HttpMethod.GET).build();
		
		assertThat(request.getMethod(), is(equalTo(HttpMethod.GET)));
	}
	
	@Test
	public void should_build_a_http_with_a_body_and_a_method() {
		Body bodyMessage = new BodyMessage("Success");
		
		MyHttpRequest request = new MyHttpRequestBuilder()
				.withBody(bodyMessage)
				.withMethod(HttpMethod.POST).build();
		
		assertThat(request.getBody(), is(equalTo(bodyMessage)));
		assertThat(request.getMethod(), is(equalTo(HttpMethod.POST)));
	}

}
