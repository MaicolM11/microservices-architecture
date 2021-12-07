package com.edu.uptc.commonsmicroservices.controllers;

import java.util.Optional;

import com.edu.uptc.commonsmicroservices.services.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Content-Type")
public class CommonController <E,S extends CommonService<E>> {
    
    @Autowired
    protected S service;

    @GetMapping
    private ResponseEntity<?> toList(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getById(@PathVariable("id") Long id){
        Optional<E> findById = service.findById(id);
        if(findById.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(findById.get());
    }

    @PostMapping
    private ResponseEntity<?> save(@RequestBody E contact){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(contact));
    }

    @DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
