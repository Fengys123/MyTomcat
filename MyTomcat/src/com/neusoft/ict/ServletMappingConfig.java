package com.neusoft.ict;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {
	
	public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();
	
	static{
		servletMappingList.add(new ServletMapping("fingGirl", "/girl", "com.neusoft.ict.FindGirlServlet"));
		servletMappingList.add(new ServletMapping("helloWorld", "/world", "com.neusoft.ict.HelloWorldServlet"));
		servletMappingList.add(new ServletMapping("favicon.ico", "/favicon.ico", "com.neusoft.ict.HelloWorldServlet"));
	}
}
