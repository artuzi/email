package com.artuzi.email.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.artuzi.email.entity.Destinatario;

@Repository
public interface DestinatarioRepository extends CrudRepository<Destinatario, Long> { 
    
}
