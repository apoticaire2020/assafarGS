package com.gestionstk.assafar.services.impl;

import java.util.List;

import com.gestionstk.assafar.dto.UtilisateurDto;
import com.gestionstk.assafar.exception.EntityNotFoundException;
import com.gestionstk.assafar.exception.ErrorCodes;
import com.gestionstk.assafar.model.Utilisateur;
import com.gestionstk.assafar.repository.UtilisateurRepository;
import com.gestionstk.assafar.services.UtilisateurService;


import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
@Slf4j
public class UtilisateurServiceImpl  implements UtilisateurService{

@Autowired
	  private UtilisateurRepository utilisateurRepository;
	  
	  
	@Override
	public UtilisateurDto save(UtilisateurDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UtilisateurDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UtilisateurDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur findByEmail(String email) {
	 return	utilisateurRepository.findUtilisateurByEmail(email)
		
		.orElseThrow(()-> new EntityNotFoundException("aucun user with email ="+email+" n a ete trouve dans BD"
				, ErrorCodes.UTILISATEUR_NOT_FOUND));
	}

}
