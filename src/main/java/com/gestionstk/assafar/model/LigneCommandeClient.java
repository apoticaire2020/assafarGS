package com.gestionstk.assafar.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity {
    
  private BigDecimal quantite;

  private BigDecimal prixUnitaire;

  private Integer idEntreprise;
  
  
  @ManyToOne
  @JoinColumn(name = "idcommande")
  private CommandeClient commandeClient;
  
  @ManyToOne
  @JoinColumn(name = "idarticle")
  private Article article;
}
