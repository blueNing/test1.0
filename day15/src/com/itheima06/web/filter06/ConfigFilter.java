package com.itheima06.web.filter06;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.itheima07.web.filter07.MyRequest1;
import com.itheima07.web.filter07.MyRequest3;

/**
 * Servlet Filter implementation class ConfigFilter
 */
public class ConfigFilter implements Filter {
	private FilterConfig config;
    /**
     * Default constructor. 
     */
    public ConfigFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request , ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//类型向下强转
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		chain.doFilter(new MyRequest3(req), response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		config=fConfig;
	}

}
