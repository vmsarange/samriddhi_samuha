package com.qsp.samriddhi_samuha.dto;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Installments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double amount;
	private Date date ;
	
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
