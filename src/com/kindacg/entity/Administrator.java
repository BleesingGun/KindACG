package com.kindacg.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

public class Administrator implements Serializable{
	private Integer a_id;
	private String a_account;
	private String a_password;
	private String a_name;
	private Integer a_telephone;
	private String a_email;
	private Timestamp a_createtime;
	private Set<Power> powers;
	
	
	public Set<Power> getPowers() {
		return powers;
	}
	public void setPowers(Set<Power> powers) {
		this.powers = powers;
	}
	public Integer getA_id() {
		return a_id;
	}
	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}
	public String getA_account() {
		return a_account;
	}
	public void setA_account(String a_account) {
		this.a_account = a_account;
	}
	public String getA_password() {
		return a_password;
	}
	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public Integer getA_telephone() {
		return a_telephone;
	}
	public void setA_telephone(Integer a_telephone) {
		this.a_telephone = a_telephone;
	}
	public String getA_email() {
		return a_email;
	}
	public void setA_email(String a_email) {
		this.a_email = a_email;
	}
	public Timestamp getA_createtime() {
		return a_createtime;
	}
	public void setA_createtime(Timestamp a_createtime) {
		this.a_createtime = a_createtime;
	}
}
