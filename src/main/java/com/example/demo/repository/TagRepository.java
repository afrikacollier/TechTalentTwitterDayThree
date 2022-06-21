package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	Tag findByPhrase(String phrase);
} 
