package com.onlineexam.web;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
	}

	/**
	 * destroy() : destroy() method called when the filter is taken out of
	 * service.
	 */
	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws java.io.IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		if (req.getRequestURI().indexOf("login") == -1) {
			String user = (String) req.getSession().getAttribute("user");
			if (user == null || "".equals(user)) {
				res.sendRedirect(req.getContextPath() + "/pages/not_login.jsp");
				return;
			}
		}

		try {
			chain.doFilter(request, response);
		} catch (Exception e) {
			res.sendRedirect(req.getContextPath() + "/pages/error.jsp");
		}


	}

}
