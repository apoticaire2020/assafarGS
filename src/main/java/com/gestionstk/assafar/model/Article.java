package com.gestionstk.assafar.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;

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
@Table(name = "article")
public class Article extends AbstractEntity {


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
   
   @OneToMany(mappedBy = "article")
   private List<LigneCommandeClient> ligneCommandeClients;
   
   @OneToMany(mappedBy = "article")
   private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;
}
