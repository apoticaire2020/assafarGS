package com.gestionstk.assafar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.gestionstk.assafar.controller.api.AuthenticationApi;
import com.gestionstk.assafar.dto.auth.AuthenticationRequest;
import com.gestionstk.assafar.dto.auth.AuthenticationResponse;
import com.gestionstk.assafar.model.auth.ExtendedUser;
import com.gestionstk.assafar.services.auth.ApplicationUserDetailsService;
import com.gestionstk.assafar.utils.JwtUtil;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;


@RestController
public class AuthenticationController implements AuthenticationApi{

	  @Autowired
	  private AuthenticationManager authenticationManager;

	  @Autowired
	  private ApplicationUserDetailsService userDetailsService;

	  @Autowired
	  private JwtUtil jwtUtil;

	  @Override
	  public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request) {
			
			
			  authenticationManager.authenticate( new UsernamePasswordAuthenticationToken(
			  request.getLogin(), request.getPassword() ) );
			 
			  
			  final UserDetails userDetails
			  = userDetailsService.loadUserByUsername(request.getLogin());
			  
			  final String jwt = jwtUtil.generateToken((ExtendedUser) userDetails);
			 

	    return ResponseEntity.ok(AuthenticationResponse.builder().accessToken(jwt).build());
	  }
}
