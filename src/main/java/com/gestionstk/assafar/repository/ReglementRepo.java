package com.gestionstk.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.Confrere;
import com.gestionstk.assafar.model.Echange;
import com.gestionstk.assafar.model.Reglement;

public interface ReglementRepo extends JpaRepository<Reglement, Integer>{

}
