package com.artuzi.email.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="destinatario")
public class Destinatario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sq_emaildest")
    @SequenceGenerator(name = "sq_emaildest", sequenceName = "SQ_IDEMAILDESTINATARIO", allocationSize = 1)	
	Long id;
    
    @Column(name = "email_destinatario")    
	String emailDestinatario;

    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_id", nullable = false)
    */
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email_id", nullable = false)
    private Email email; 
    
	public Destinatario() {
		super();
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailDestinatario() {
		return emailDestinatario;
	}
	
	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}
	
    public Email getEmail() {
		return email;
	}
    
	public void setEmail(Email email) {
		this.email = email;
	}

}
