package com.artuzi.email.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.artuzi.email.dao.EmailRepository;
import com.artuzi.email.entity.Email;


@Service
public class EmailService implements IEmailService {

    @Autowired
    private EmailRepository emailRepository;

	@Override
	public Email createEmail(Email email) {
		return emailRepository.save(email);
	}

	@Override
	public Email getEmail(Long id) {
		return emailRepository.findById(id).get();
	}

	@Override
	public Email editEmail(Email email) {
		return emailRepository.save(email);
	}

	@Override
	public void deleteEmail(Email email) {
		// TODO Auto-generated method stub
		emailRepository.delete(email);
	}


	/*	
	@Override
	public void deleteEmail(Long id) {
		emailRepository.delete(id);
	}

	@Override
	public List getAllEmails(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return emailRepository.findAll(PageRequest.of(page, size)(pageNumber, pageSize)).getContent();;
	}*/

	@Override
	public List getAllEmails() {
		Iterable<Email> emails = emailRepository.findAll();
		
		return (List) emails;
	}

	@Override
	public long countEmails() {
		// TODO Auto-generated method stub
		return emailRepository.count();
	}

}
