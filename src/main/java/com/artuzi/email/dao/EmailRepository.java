package com.artuzi.email.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.artuzi.email.entity.Email;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {

	/*
	 @Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
	    List<Article> fetchArticles(@Param("title") String title, @Param("category") String category);
    */
}
