package com.gestionstk.assafar.model;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity  {
	
	  @Id
	  @GeneratedValue
	  private Integer id;

	  @CreatedDate
	  @Column(name = "creationDate", nullable = true, updatable = false)
	  private Instant creationDate;

	  @LastModifiedDate
	  @Column(name = "lastModifiedDate")
	  private Instant lastModifiedDate;
    
}
