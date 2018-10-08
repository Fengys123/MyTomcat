package com.neusoft.ict;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class MyResponse {
	
	private OutputStream outputStream;
	
	public MyResponse(OutputStream outputStream){
		this.outputStream = outputStream;
	}
	
	public void write(String content) throws Exception{
		StringBuffer httpReponse = new StringBuffer();
		httpReponse.append("HTTP/1.1 200 OK\n")
				.append("Content-Type: text/html\n")
				.append("\r\n")
				.append("<html><head><!--<link rel='icon' href='/favicon.ico'  type='image/x-icon'>\n" +
						"<link rel='shortcut icon' href='/favicon.ico'  type='image/x-icon'>-->\n" +"</head><body>")
				.append(content)
				.append("</body></html>");
		
		outputStream.write(httpReponse.toString().getBytes());
		outputStream.close();
	}

	public void write() throws IOException {
		FileInputStream fis = new FileInputStream("C:/a.ico");
		int size = fis.available();
		byte data[] = new byte[size] ;


		StringBuffer httpReponse = new StringBuffer();
		httpReponse.append("HTTP/1.1 200 OK\n")
				.append("Content-Type: image/x-icon\n")
				.append("\r\n")
				.append(new String(data));
		fis.read(data) ;
		fis.close();
		outputStream.write(httpReponse.toString().getBytes());
		//outputStream.write(httpReponse.toString().getBytes());
		outputStream.close();

	}

}
