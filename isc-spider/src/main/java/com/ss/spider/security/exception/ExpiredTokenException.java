package com.ss.spider.security.exception;

import com.ss.spider.security.model.token.JwtToken;
import org.springframework.security.core.AuthenticationException;


public class ExpiredTokenException extends AuthenticationException {

    private static final long serialVersionUID = -5959543783324224864L;
    private JwtToken token;

    public ExpiredTokenException(String msg) {
        super(msg);
    }


    public ExpiredTokenException(JwtToken token, String msg, Throwable t) {
        super(msg, t);
        this.token = token;
    }


    public String token() {
        return this.token.getToken();
    }

}
