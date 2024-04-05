package com.gestionstk.assafar.services;

import java.util.List;

import com.gestionstk.assafar.dto.UtilisateurDto;
import com.gestionstk.assafar.model.Utilisateur;

public interface UtilisateurService {

	
	  UtilisateurDto save(UtilisateurDto dto);

	  UtilisateurDto findById(Integer id);

	  List<UtilisateurDto> findAll();

	  void delete(Integer id);

	  Utilisateur findByEmail(String email);

	 // UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);
}
