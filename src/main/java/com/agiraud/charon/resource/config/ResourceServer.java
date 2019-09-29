package com.agiraud.charon.resource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.authentication.TokenExtractor;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;

public class ResourceServer extends ResourceServerConfigurerAdapter {
	/* ************************************************************************* */
	// ATTRIBUTES
	/* ************************************************************************* */
	@Autowired
	private TokenStore tokenStore;
	
	@Autowired
	private ResourceServerTokenServices tokenServices;
	
	@Autowired
	public TokenExtractor tokenExtractor;

	/* ************************************************************************* */
	// OVERRIDE
	/* ************************************************************************* */
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources
			.tokenServices(tokenServices)
			.tokenStore(tokenStore)
			.tokenExtractor(tokenExtractor);
	}


	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
			.antMatcher("/me")
			.authorizeRequests().anyRequest().authenticated();
	}
	
}