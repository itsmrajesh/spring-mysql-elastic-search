package com.lwl.elasticsearchdemo.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "MOCK_DATA")
public class User {
	@Id
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String uid;

}
