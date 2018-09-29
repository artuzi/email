package com.artuzi.email.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="email")
public class Email implements Serializable{

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sq_email")
    @SequenceGenerator(name = "sq_email", sequenceName = "SQ_IDEMAIL", allocationSize = 1)
	Long id;
	
    @Column(name = "template")
	String template;

    @Column(name = "dtsolicitacao")
    @Temporal(TemporalType.DATE)
	Date dtSolicitacao;

    @Column(name = "idagendamento")
    Long idAgendamento;
    
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "email")
    private List<Destinatario> destinatarios;
    
	public Email() {
		super();
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public Date getDtSolicitacao() {
		return dtSolicitacao;
	}
	public void setDtSolicitacao(Date dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
	}
	public Long getIdAgendamento() {
		return idAgendamento;
	}
	public void setIdAgendamento(Long idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

    public List<Destinatario> getDestinatarios() {
		return destinatarios;
	}
	public void setDestinatarios(List<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}
	
}

