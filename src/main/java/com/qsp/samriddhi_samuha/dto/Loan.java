package com.qsp.samriddhi_samuha.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long loanAccno;
	private double amount;
	private double dueAmount;
	
	public long getLoanAccno() {
		return loanAccno;
	}
	public void setLoanAccno(long loanAccno) {
		this.loanAccno = loanAccno;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}