package com.generationapi.blogpessoaldami.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationapi.blogpessoaldami.model.PostagemModel;
import com.generationapi.blogpessoaldami.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController{
	
	@Autowired 
	private PostagemRepository postagemRepository;
	
	@GetMapping
	public ResponseEntity<List<PostagemModel>>getAll (){
		return ResponseEntity.ok(postagemRepository.findAll());
	}
	

}
