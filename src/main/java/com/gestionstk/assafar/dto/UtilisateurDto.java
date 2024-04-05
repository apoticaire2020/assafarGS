package com.gestionstk.assafar.dto;



import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.gestionstk.assafar.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {
	
	  private Integer id;

	  private String nom;

	  private String prenom;

	  private String email;

	 
	  private String moteDePasse;

	
	  private EntrepriseDto entreprise;

	  private List<RolesDto> roles;

	  public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
	    if (utilisateur == null) {
	      return null;
	    }

	    return UtilisateurDto.builder()
	        .id(utilisateur.getId())
	        .nom(utilisateur.getNom())
	        .prenom(utilisateur.getPrenom())
	        .email(utilisateur.getEmail())
	        .moteDePasse(utilisateur.getMoteDePasse())
	             
	        .entreprise(EntrepriseDto.fromEntity(utilisateur.getEntreprise()))
	        .roles(
	            utilisateur.getRoles() != null ?
	                utilisateur.getRoles().stream()
	                    .map(RolesDto::fromEntity)
	                    .collect(Collectors.toList()) : null
	        )
	        .build();
	  }

	  public static Utilisateur toEntity(UtilisateurDto dto) {
	    if (dto == null) {
	      return null;
	    }

	    Utilisateur utilisateur = new Utilisateur();
	    utilisateur.setId(dto.getId());
	    utilisateur.setNom(dto.getNom());
	    utilisateur.setPrenom(dto.getPrenom());
	    utilisateur.setEmail(dto.getEmail());
	    utilisateur.setMoteDePasse(dto.getMoteDePasse());
	  	   
	    utilisateur.setEntreprise(EntrepriseDto.toEntity(dto.getEntreprise()));

	    return utilisateur;
	  }

}
