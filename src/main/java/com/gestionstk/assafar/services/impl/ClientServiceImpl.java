package com.gestionstk.assafar.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionstk.assafar.dto.CategoryDto;
import com.gestionstk.assafar.dto.ClientDto;
import com.gestionstk.assafar.repository.ClientRepository;
import com.gestionstk.assafar.services.ClientService;


@Service
public class ClientServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;
	
@Autowired
	public ClientServiceImpl(ClientRepository clientRepository) {
		
		this.clientRepository = clientRepository;
	}

	@Override
	public ClientDto save(ClientDto dto) {
		
		return ClientDto.fromEntity(clientRepository.save(ClientDto.toEntity(dto)));
	}

	@Override
	public ClientDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientDto> findAll() {
		return clientRepository.findAll().stream()
				.map(ClientDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
