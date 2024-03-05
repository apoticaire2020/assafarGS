package com.gestionstk.assafar.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.CommandeClient;

public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {

  Optional<CommandeClient> findCommandeClientByCode(String code);

  List<CommandeClient> findAllByClientId(Integer id);
}