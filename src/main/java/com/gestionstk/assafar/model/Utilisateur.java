package com.gestionstk.assafar.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity {

	  private String nom;

	  private String prenom;

	  private String email;

	  private String moteDePasse;

	  @ManyToOne
	  @JoinColumn(name = "identreprise")
	  private Entreprise entreprise;


	  @OneToMany(fetch = FetchType.EAGER, mappedBy = "utilisateur")
	  @JsonIgnore
	  private List<Roles> roles;
}
