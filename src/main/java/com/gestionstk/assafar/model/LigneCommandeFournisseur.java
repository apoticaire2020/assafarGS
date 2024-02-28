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
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandefournisseur")
@AllArgsConstructor
@NoArgsConstructor
public class LigneCommandeFournisseur extends AbstractEntity{

  private BigDecimal quantite;
  private String nom_produit;
  private BigDecimal prixUnitaire;
  private Integer idEntreprise;

  @ManyToOne
  @JoinColumn(name = "idarticle")
  private Article article;

  @ManyToOne
  @JoinColumn(name = "idcommandefournisseur")
  private CommandeFournisseur commandeFournisseur;
}
