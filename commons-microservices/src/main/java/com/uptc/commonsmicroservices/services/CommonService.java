package com.uptc.commonsmicroservices.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface CommonService <E> {
    public Iterable<E> findAll();

    public Optional<E> findById(Long id);

    public E save(E entity);
    
    public void deleteById(Long id);
}
