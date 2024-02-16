package com.gestionstk.assafar.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "article")
public class Article {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Integer idProduit;

    private String designation;
    private Integer Qtestock;
    private BigDecimal  prixunitaire;
    private BigDecimal  taux;
    private BigDecimal prixAchat;
    private String description;
    private Integer idEntreprise;


   @ManyToOne
   @JoinColumn(name = "idcategorie")
  private Category category;
}
