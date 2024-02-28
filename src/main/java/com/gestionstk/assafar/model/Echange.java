package com.gestionstk.assafar.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
