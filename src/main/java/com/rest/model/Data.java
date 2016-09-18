package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Data {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String user;

	private String valuePlan;

	public Data(String user, String valuePlan) {
		super();
		this.user = user;
		this.valuePlan = valuePlan;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getValuePlan() {
		return valuePlan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setValuePlan(String valuePlan) {
		this.valuePlan = valuePlan;
	}

	@Override
	public String toString() {
		return "DataModel [id=" + id + ", user=" + user + ", valuePlan=" + valuePlan + "]";
	}
}
