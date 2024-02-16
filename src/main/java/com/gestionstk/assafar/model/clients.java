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
@Table(name = "client")
public class clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idclient;
    private String nomcomplet;
    private String adress;
    private String tel;
    private BigDecimal solde;
    private Integer idEntreprise;

     @OneToMany(mappedBy = "client")
  private List<CommandeClient> commandeClients;

}
