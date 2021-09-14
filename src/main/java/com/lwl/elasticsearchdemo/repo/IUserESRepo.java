package com.lwl.elasticsearchdemo.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.lwl.elasticsearchdemo.model.UserModel;

@Repository
public interface IUserESRepo extends ElasticsearchRepository<UserModel, String> {
}