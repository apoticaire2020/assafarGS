package com.gestionstk.assafar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.Clients;

public interface ClientRepository extends JpaRepository<Clients, Integer> {

}
