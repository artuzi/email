package com.artuzi.emai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artuzi.email.dao.DestinatarioRepository;
import com.artuzi.email.entity.Destinatario;

@Service
public class DestinatarioService implements IDestinatarioService {

    @Autowired
    private DestinatarioRepository destinatarioRepository;
	
	
	@Override
	public Destinatario createDestinatario(Destinatario destinatario) {
		// TODO Auto-generated method stub
		return destinatarioRepository.save(destinatario);
	}

	@Override
	public Destinatario getDestinatario(Long id) {
		// TODO Auto-generated method stub
		return destinatarioRepository.findById(id).get();
	}

	@Override
	public Destinatario editDestinatario(Destinatario destinatario) {
		// TODO Auto-generated method stub
		return destinatarioRepository.save(destinatario);
	}

	@Override
	public void deleteDestinatario(Destinatario destinatario) {
		// TODO Auto-generated method stub
		destinatarioRepository.delete(destinatario);
	}

	@Override
	public List getAllDestinatarios() {
		// TODO Auto-generated method stub
		Iterable<Destinatario> destinatarios = destinatarioRepository.findAll();
		
		return (List) destinatarios;
	}

	@Override
	public long countDestinatarios() {
		// TODO Auto-generated method stub
		return destinatarioRepository.count();
	}

}
