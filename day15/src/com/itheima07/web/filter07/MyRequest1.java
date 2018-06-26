package com.itheima07.web.filter07;

import java.io.UnsupportedEncodingException;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.RequestFacade;

public class MyRequest1 extends RequestFacade {

	public MyRequest1(Request request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String parameter = super.getParameter(name);
		try {
			return new String(parameter.getBytes("iso-8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
}
