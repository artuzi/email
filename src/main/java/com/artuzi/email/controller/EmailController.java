package com.artuzi.email.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.artuzi.emai.service.IEmailService;
import com.artuzi.email.entity.Destinatario;
import com.artuzi.email.entity.Email;

@Controller
public class EmailController {

	Logger logger = LoggerFactory.getLogger(EmailController.class);
	
	@Autowired
	private IEmailService emailService;	
	
	@GetMapping("solicitacoes")
	public ResponseEntity<Void>  ProcessaSolicitacoes() {
		List<Destinatario> destinatarios = new ArrayList<Destinatario>();

		logger.info("Iniciando");
		
		Email email = new Email();
		email.setTemplate("EM00100");
		
		Destinatario destinatario1 = new Destinatario();
		destinatario1.setEmailDestinatario("denis@artuzi.com");
		destinatario1.setEmail(email);

		Destinatario destinatario2 = new Destinatario();
		destinatario2.setEmailDestinatario("artuzi@gmail.com");
		destinatario2.setEmail(email);

		destinatarios.add(destinatario1);
		destinatarios.add(destinatario2);
		email.setDestinatarios(destinatarios);

		logger.info("Processando solicitacao");
		
		emailService.createEmail(email);
		
		logger.info("Email solicitado");

		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
