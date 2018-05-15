package com.kindacg.entity;

import java.io.Serializable;
import java.util.Set;

public class Power implements Serializable {
	private int p_id;
	private int p_create;
	private int p_update;
	private int p_retrieve;
	private int p_delete;
	private int p_comment;
	private Set<Administrator> administrators;
	private Set<User> users;
	

	
	public Set<Administrator> getAdministrators() {
		return administrators;
	}
	public void setAdministrators(Set<Administrator> administrators) {
		this.administrators = administrators;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getP_create() {
		return p_create;
	}
	public void setP_create(int p_create) {
		this.p_create = p_create;
	}
	public int getP_update() {
		return p_update;
	}
	public void setP_update(int p_update) {
		this.p_update = p_update;
	}
	public int getP_retrieve() {
		return p_retrieve;
	}
	public void setP_retrieve(int p_retrieve) {
		this.p_retrieve = p_retrieve;
	}
	public int getP_delete() {
		return p_delete;
	}
	public void setP_delete(int p_delete) {
		this.p_delete = p_delete;
	}
	public int getP_comment() {
		return p_comment;
	}
	public void setP_comment(int p_comment) {
		this.p_comment = p_comment;
	}
}
