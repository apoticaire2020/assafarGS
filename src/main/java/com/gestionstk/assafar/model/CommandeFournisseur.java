package com.gestionstk.assafar.model;



import java.math.BigDecimal;
import java.util.Date;
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
