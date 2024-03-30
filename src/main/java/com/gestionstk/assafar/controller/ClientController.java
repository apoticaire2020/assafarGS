package com.gestionstk.assafar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.gestionstk.assafar.controller.api.ClientApi;
import com.gestionstk.assafar.dto.ClientDto;
import com.gestionstk.assafar.services.ClientService;


@RestController
public class ClientController implements ClientApi{
	
	private ClientService clientService;
	
	public ClientController(ClientService clientService) {
	
		this.clientService = clientService;
	}

	@Override
	public ClientDto save(ClientDto dto) {
		 return clientService.save(dto);
	}

	@Override
	public ClientDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientDto> findAll() {
		return clientService.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
