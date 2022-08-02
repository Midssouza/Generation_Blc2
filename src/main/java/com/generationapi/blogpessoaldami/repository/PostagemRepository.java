package com.generationapi.blogpessoaldami.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationapi.blogpessoaldami.model.PostagemModel;

@Repository 
public interface PostagemRepository extends JpaRepository <PostagemModel, Long>{

}
