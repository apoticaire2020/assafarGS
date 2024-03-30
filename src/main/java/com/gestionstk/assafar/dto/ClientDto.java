package com.gestionstk.assafar.dto;

import java.math.BigDecimal;

import com.gestionstk.assafar.model.Clients;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {
	   private Integer id;
    	 private String nomcomplet;
	    private String adress;
	    private String tel;
	    private BigDecimal solde;
	    private Integer idEntreprise;

	    public static ClientDto fromEntity(Clients client) {
	        if (client == null) {
	          return null;
	        }
	        return ClientDto.builder()
	            .id(client.getId())
	            .nomcomplet(client.getNomcomplet())
	            .adress(client.getAdress())
	            .tel(client.getTel())
	            .solde(client.getSolde())
	            .idEntreprise(client.getIdEntreprise())
	            .build();
	      }
	    public static Clients toEntity(ClientDto dto) {
	        if (dto == null) {
	          return null;
	        }
	        Clients client = new Clients();
	        client.setId(dto.getId());
	        client.setNomcomplet(dto.getNomcomplet());
	       client.setSolde(dto.getSolde());
	        client.setAdress(dto.getAdress());
	    
	        client.setTel(dto.getTel());
	        client.setIdEntreprise(dto.getIdEntreprise());
	        return client;
	      }

}
