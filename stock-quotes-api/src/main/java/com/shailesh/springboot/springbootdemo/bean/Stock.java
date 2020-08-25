package com.shailesh.springboot.springbootdemo.bean;

import java.util.Date;

import javax.validation.constraints.Size;

public class Stock {
	
	private String stockQuote;
	private String companyName;
	private Date date;
	private String price;
	private String currency;
	
	public Stock(String stockQuote, String companyName, Date date, String price, String currency) {
		super();
		this.stockQuote = stockQuote;
		this.companyName = companyName;
		this.date = date;
		this.price = price;
		this.currency = currency;
	}
	
	public String getStockQuote() {
		return stockQuote;
	}
	public void setStockQuote(String stockQuote) {
		this.stockQuote = stockQuote;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
