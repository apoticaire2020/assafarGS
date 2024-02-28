package com.gestionstk.assafar.model;

import java.math.BigDecimal;

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
@Table(name = "echangedetail")
public class EchangeDetail extends AbstractEntity	  {
	
	  
	  private BigDecimal quantite;

	  private BigDecimal prixUnitaire;
	
	  private Integer idEntreprise;
	  
	  
	  @ManyToOne
	  @JoinColumn(name = "idarticle")
	  private Article	article;
	  

	  @ManyToOne
	  @JoinColumn(name = "idechange")
	  private Echange	echange;
	  
}
