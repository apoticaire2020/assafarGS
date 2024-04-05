package com.gestionstk.assafar.controller.api;

import static com.gestionstk.assafar.utils.Constants.AUTHENTICATION_ENDPOINT;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestionstk.assafar.dto.auth.AuthenticationRequest;
import com.gestionstk.assafar.dto.auth.AuthenticationResponse;

@Api("authentication")
public interface AuthenticationApi {

	
	  @PostMapping(AUTHENTICATION_ENDPOINT + "/authenticate")
	  public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request);
}
