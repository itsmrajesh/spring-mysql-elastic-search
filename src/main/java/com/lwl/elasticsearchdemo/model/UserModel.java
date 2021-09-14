package com.lwl.elasticsearchdemo.model;

import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(indexName = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String uid;

}
