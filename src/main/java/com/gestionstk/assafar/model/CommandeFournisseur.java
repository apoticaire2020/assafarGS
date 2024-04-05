package com.gestionstk.assafar.model;



import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
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
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity{
   
       private String bon_livraison;
       private Integer idEntreprise;
       private String nom_fournisseur;
       private Date  date_livraison;
       private BigDecimal montant_achat;
       private BigDecimal remise;
       private BigDecimal montant_achat_net;
       
        @ManyToOne
        @JoinColumn(name = "idfournisseur")
        private Fournisseur fournisseur;

       
       @OneToMany(mappedBy = "commandeFournisseur")
       private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;

}
