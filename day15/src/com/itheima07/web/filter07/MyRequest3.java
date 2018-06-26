package com.itheima07.web.filter07;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequest3 extends HttpServletRequestWrapper{

	public MyRequest3(HttpServletRequest request) {
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
