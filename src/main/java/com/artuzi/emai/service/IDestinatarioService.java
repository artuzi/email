package com.artuzi.emai.service;

import java.util.List;

import com.artuzi.email.entity.Destinatario;

public interface IDestinatarioService {
    
	Destinatario createDestinatario(Destinatario destinatario);
    Destinatario getDestinatario(Long id);
    Destinatario editDestinatario(Destinatario destinatario);
    void deleteDestinatario(Destinatario destinatario);
    //void deleteDestinatario(Long id);
    //List getAllDestinatarios(int pageNumber, int pageSize);
    List getAllDestinatarios();
    long countDestinatarios();
}
