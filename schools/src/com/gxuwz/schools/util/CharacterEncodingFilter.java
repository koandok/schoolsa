package com.gxuwz.schools.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ¶¨Òå×Ö·û±àÂë¹ýÂËÆ÷
 * @author ÑÝÊ¾
 *
 */
public class CharacterEncodingFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse  resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;   
	    HttpServletResponse response = (HttpServletResponse) resp;  
	    request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");  
		chain.doFilter(req, resp);
	}

	public void init(FilterConfig config) throws ServletException {
	}

}
