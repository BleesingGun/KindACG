package com.kindacg.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

public class User implements Serializable {
	private Integer u_id;
	private String u_account;
	private String u_password;
	private String u_name;
	private Integer u_telephone;
	private String u_email;
	private Timestamp u_createtime;
	private Set<Power> powers;
	
	
	public Set<Power> getPowers() {
		return powers;
	}
	public void setPowers(Set<Power> powers) {
		this.powers = powers;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public Integer getU_telephone() {
		return u_telephone;
	}
	public void setU_telephone(Integer u_telephone) {
		this.u_telephone = u_telephone;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public Timestamp getU_createtime() {
		return u_createtime;
	}
	public void setU_createtime(Timestamp u_createtime) {
		this.u_createtime = u_createtime;
	}
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_account=" + u_account + ", u_password=" + u_password + ", u_name=" + u_name
				+ ", u_telephone=" + u_telephone + ", u_email=" + u_email + ", u_createtime=" + u_createtime
				+ ", powers=" + powers + "]";
	}
	
}
