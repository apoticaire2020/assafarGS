package com.gestionstk.assafar.services;

import java.util.List;

import com.gestionstk.assafar.dto.ClientDto;

public interface ClientService {

	ClientDto save(ClientDto dto);

	  ClientDto findById(Integer id);

	  List<ClientDto> findAll();

	  void delete(Integer id);
}
