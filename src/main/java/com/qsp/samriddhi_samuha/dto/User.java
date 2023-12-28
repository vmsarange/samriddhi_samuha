package com.qsp.samriddhi_samuha.dto;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private long phone;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String password;
	private Date dob;
	private long accno;
	@OneToOne
	private Loan loan;
	@OneToMany
	private List<Installments> installments ;
	
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public List<Installments> getInstallments() {
		return installments;
	}
	public void setInstallments(List<Installments> installments) {
		this.installments = installments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	
	
}
