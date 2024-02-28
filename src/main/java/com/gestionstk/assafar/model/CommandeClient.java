package com.gestionstk.assafar.model;

import java.time.Instant;
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
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity{

  private  Integer idcommande;
    private String code;
    private Instant dateCommande;
    private Integer idEntreprise;
  
  @ManyToOne
  @JoinColumn(name = "idclient")
  private Clients clients;
  
  @OneToMany(mappedBy = "commandeClient")
  private List<LigneCommandeClient> ligneCommandeClients;
}
