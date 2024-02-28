package com.gestionstk.assafar.model;




import java.math.BigDecimal;
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
@Table(name = "confrere")
public class Confrere extends AbstractEntity{
	
	private String officine;
	
	private String tel;
	
	private BigDecimal solde;
	private Integer idEntreprise;

    @OneToMany(mappedBy = "confrere")
 private List<Echange> echange;
}
