package com.gestionstk.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}