package com.neusoft.ict;

import java.io.InputStream;

public class MyRequest {
	private String url;
	private String method;
	
	public MyRequest(InputStream inputStream) throws Exception{
		String httpRequest = "";
		byte[] httpRequestBytes = new byte[1024];
		int length = 0;
		if((length = inputStream.read(httpRequestBytes)) > 0){
			httpRequest = new String(httpRequestBytes, 0, length);
		}
		
		String httpHead = httpRequest.split("\n")[0];
		this.method = httpHead.split("\\s")[0];
		this.url = httpHead.split("\\s")[1];
		System.out.println(this);
	}

	public String getUrl() {
		return url;
	}

	public String getMethod() {
		return method;
	}
	
	
}
