package com.ss.spider.security.auth;

import com.ss.spider.security.model.UserContext;
import com.ss.spider.security.model.token.RawAccessJwtToken;

import java.util.Collection;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;


public class JwtAuthenticationToken extends AbstractAuthenticationToken {

    private static final long serialVersionUID = 2877954820905567501L;
    private RawAccessJwtToken rawAccessToken;
    private UserContext userContext;

    public JwtAuthenticationToken(RawAccessJwtToken unsafeToken) {
        super(null);
        this.rawAccessToken = unsafeToken;
        setAuthenticated(false);
    }


    public JwtAuthenticationToken(UserContext userContext, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        eraseCredentials();
        this.userContext = userContext;
        super.setAuthenticated(true);
    }


    public void setAuthenticated(boolean authenticated) {
        if (authenticated) {
            throw new IllegalArgumentException("Cannot set this token to trusted - use constructor which takes a GrantedAuthority list instead");
        }

        super.setAuthenticated(false);
    }


    public Object getCredentials() {
        return this.rawAccessToken;
    }


    public Object getPrincipal() {
        return this.userContext;
    }


    public void eraseCredentials() {
        super.eraseCredentials();
        this.rawAccessToken = null;
    }

}
