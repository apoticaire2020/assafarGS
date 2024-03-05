package com.gestionstk.assafar.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Integer> {

  List<LigneCommandeFournisseur> findAllByCommandeFournisseurId(Integer idCommande);

  List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommande);
}