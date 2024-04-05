package com.gestionstk.assafar.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
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
