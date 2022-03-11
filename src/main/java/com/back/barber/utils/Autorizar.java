package com.back.barber.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;



@Component
public class Autorizar implements Filter {
    // Llave de cifrado y descifrado
    public static final String KEY = "bjhhjgffgdvkjbkjbkjbjhvhjgd";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
       
        HttpServletResponse resp = (HttpServletResponse) response;
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST");

        String url = req.getRequestURI();
        // http://localhost:8080 ------->url

        if (url.contains("/api/detail")) {
            chain.doFilter(request, response);
        }else{
            String hash=req.getHeader("Authorization");
            if(hash==null || hash.trim().equals("")){
                response.setContentType("application/json");
                String body="{\"autorizacion\":\"NO\"}";
                response.getWriter().write(body);
            }
                
        }
    }

}