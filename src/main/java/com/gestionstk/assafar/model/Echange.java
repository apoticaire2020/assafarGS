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
@Table(name = "echange")
public class Echange extends AbstractEntity{

	private Instant  date_echange;
	 private BigDecimal montant_echange;
	 private Integer idEntreprise;

	   @ManyToOne
	   @JoinColumn(name = "idconfrere")
	  private Confrere confrere;
	   
	   @OneToMany(mappedBy = "echange")
	   private List<EchangeDetail> echangedetail;
}
