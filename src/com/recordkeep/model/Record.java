package com.recordkeep.model;
import java.sql.Date;
import java.math.BigDecimal;
public class Record {
	private int id;
	private String name;
	private String category;
	private Date date;
	private BigDecimal debit;
	private BigDecimal credit;
	private String paymentType;
	private String payee;
	private String payer;
	private String note;
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getCategory(){
		return this.category;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public BigDecimal getDebit(){
		return this.debit;
	}
	
	
	public BigDecimal getCredit(){
		return this.credit;
	}
	
	public String getPaymentType(){
		return this.paymentType;
	}
	
	
	public String getPayee(){
		return this.payee;
	}
	
	public String getPayer(){
		return this.payer;
	}
	
	public String getNote(){
		return this.note;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCategory(String category){
		this.category = category;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public void setDebit(BigDecimal debit){
		this.debit = debit;
	}
	
	public void setCredit(BigDecimal credit){
		this.credit = credit;
	}
	
	public void setPaymentType(String paymentType){
		this.paymentType = paymentType;
	}
	
	public void setPayee(String payee){
		this.payee = payee;
	}
	
	public void setPayer(String payer){
		this.payer = payer;
	}
	
	public void setNote(String note){
		this.note = note;
	}
	
}
