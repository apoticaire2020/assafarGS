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
@Table(name = "clients")
public class Clients extends AbstractEntity {
   
    private String nomcomplet;
    private String adress;
    private String tel;
    private BigDecimal solde;
    private Integer idEntreprise;

     @OneToMany(mappedBy = "clients")
  private List<CommandeClient> commandeClients;

     @OneToMany(mappedBy = "clients")
  private List<Reglement> reglement ;
 }
