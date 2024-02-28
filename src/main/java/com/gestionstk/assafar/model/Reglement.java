package com.gestionstk.assafar.model;

import java.math.BigDecimal;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reglement")
public class Reglement extends AbstractEntity{

	
	  private Instant dateReglement;
	  private BigDecimal montantRegle;
	  private Integer idEntreprise;
	  
	  @ManyToOne
	  @JoinColumn(name = "idclient")
	  private Clients clients;
}
