package com.gestionstk.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.Confrere;
import com.gestionstk.assafar.model.Echange;

public interface EchangeRepo extends JpaRepository<Echange, Integer>{

}
