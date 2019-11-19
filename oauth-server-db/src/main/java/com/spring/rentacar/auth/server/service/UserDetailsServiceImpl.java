package com.spring.rentacar.auth.server.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.rentacar.auth.server.model.AuthUserDetail;
import com.spring.rentacar.auth.server.model.User;
import com.spring.rentacar.auth.server.service.repository.UserDetilsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UserDetilsRepository userDetailsRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		System.out.println("USer Name:"+username);

		Optional<User> user = userDetailsRepository.findByUsername(username);
		user.orElseThrow(() -> new UsernameNotFoundException("Username or Password is wrong."));
		
		UserDetails userdetails = new AuthUserDetail(user.get());
		
		new AccountStatusUserDetailsChecker().check(userdetails);
		
		return userdetails;
	}

}
