package com.artuzi.email.service;

import java.util.List;

import com.artuzi.email.entity.Email;


public interface IEmailService {
    Email createEmail(Email email);
    Email getEmail(Long id);
    Email editEmail(Email email);
    void deleteEmail(Email email);
    //void deleteEmail(Long id);
    //List getAllEmails(int pageNumber, int pageSize);
    List getAllEmails();
    long countEmails();
}
