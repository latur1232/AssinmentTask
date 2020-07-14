package com.as.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_tab")
public class StorTableFour {
	
	@Column(name = "mobile_num")
	private String mobNum;
	@Column(name = "expiry_time")
	private String expirytime;
	@Column(name = "created_time")
	private String createdtime;
	public StorTableFour() {
		super();
	}
	public String getMobNum() {
		return mobNum;
	}
	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}
	public String getExpirytime() {
		return expirytime;
	}
	public void setExpirytime(String expirytime) {
		this.expirytime = expirytime;
	}
	public String getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(String createdtime) {
		this.createdtime = createdtime;
	}
	@Override
	public String toString() {
		return "StorTableFour [mobNum=" + mobNum + ", expirytime=" + expirytime + ", createdtime=" + createdtime + "]";
	}
	
	


}
