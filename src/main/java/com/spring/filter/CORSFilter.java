package com.spring.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * http://www.mkjava.com/tutorial/filter-vs-interceptor/
 * Filters are J2EE web applications related, is non-spring context.
 * In Spring there are two different constructs that get called "interceptors" - 
 * 1 -  Handler Interceptors - add interceptor logic to web requests.
 * 2 -  AOP - add interceptor logic to methods.
 * 
 * Spring Interceptors are similar to Servlet Filters but they acts in Spring Context.
 * 
 * Configured in web.xml
 * */
 
public class CORSFilter implements Filter {

    public void init(FilterConfig filterConfig) {
        System.err.println("****************************Filter ******************************************1");
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        chain.doFilter(req, res);
        System.err.println("****************************Filter ******************************************2");
    }

    public void destroy() {
        System.err.println("****************************Filter ******************************************3");

    }

}