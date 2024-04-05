package com.gestionstk.assafar.model;

import java.math.BigDecimal;
import java.util.List;

import java.io.Serializable;
import java.time.Instant;
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

import lombok.Data;
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
