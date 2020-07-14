package com.as.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Optin_Table_Three")
public class OptinTableThree {
	@Id
	@Column(name = "product_id")
	@GeneratedValue(generator = "optintable")
	@GenericGenerator(name = "optin", strategy = "increment")
	private Integer optinId;
	@Column(name = "mobile_num")
	private String mobNum;
	@Id
	@Column(name = "policy_number")
	@GeneratedValue(generator = "optpolicy")
	@GenericGenerator(name = "opypolicy", strategy = "increment")
	private Integer policynumber;
	@Column(name = "optin_date")
	private Integer optinDate;

	public OptinTableThree() {
		super();
	}

	public Integer getOptinId() {
		return optinId;
	}

	public void setOptinId(Integer optinId) {
		this.optinId = optinId;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public Integer getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(Integer policynumber) {
		this.policynumber = policynumber;
	}

	public Integer getOptinDate() {
		return optinDate;
	}

	public void setOptinDate(Integer optinDate) {
		this.optinDate = optinDate;
	}

	@Override
	public String toString() {
		return "OptinTableThree [optinId=" + optinId + ", mobNum=" + mobNum + ", policynumber=" + policynumber
				+ ", optinDate=" + optinDate + "]";
	}

}
