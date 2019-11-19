package com.spring.rentacar.auth.server.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter {

	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	
	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("pradeep").password(passwordEncoder.encode("pradeep")).roles("ADMIN", "USER", "MANAGER")
				.authorities("CAN_READ", "CAN_WRITE").and().withUser("pradeep2").password(passwordEncoder.encode("pradeep2")).roles("MANAGER")
				.authorities("CAN_READ");
	}
}
