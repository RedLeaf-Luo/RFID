package com.bulb.rfid.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 解决跨域问题
 */
public class CorsFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		HttpServletResponse res = (HttpServletResponse) response;

		res.setHeader("Access-Control-Allow-Origin", "*");// 允许所有的访问

		res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");// 允许的请求方式

		res.setHeader("Access-Control-Max-Age", "600");

		res.setHeader("Access-Control-Allow-Headers",
				"Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");

		res.setHeader("Access-Control-Allow-Credentials", "true");

		res.setHeader("XDomainRequestAllowed", "1");

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}
}
