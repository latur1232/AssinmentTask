package com.as.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Policy_tab")
public class Policy {

	@Id
	@Column(name = "policy_number")
	@GeneratedValue(generator = "policy")
	@GenericGenerator(name = "policy", strategy = "increment")
	private Integer policynumber;
	@Column(name = "customer_id")
	private Integer customerid;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "dob")
	private String dob;
	@Column(name = "email_Address")
	private String emailAddress;
	@Column(name = "phone_number")
	private String mobileNumber;
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "permiummodetab", joinColumns = @JoinColumn(name = "policy_number")) // join column
	@OrderColumn(name = "pmode") // index
	@Column(name = "permiummode") // column name
	private List<String> permiumMode;
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "Policy_status", joinColumns = @JoinColumn(name = "policy_number")) // join column
	@OrderColumn(name = "pstatus") // index column
	@Column(name = "psatatuss") // colimn name
	private Set<String> policystatus;
	@Column(name = "cust_Pannum")
	private String customerPanNum;
	@Column(name = "policy_insdate")
	private Integer policyInsDate;
	@Column(name = "contact_numlupd")
	private Integer contNumlastupd;
	@Column(name = "emailadd_laupdate")
	private String emailaddlaupdate;
	@Column(name = "bank_accnum")
	private long bankaccnum;

	@Column(name = "whatsapp_opt_status")
	private String whatsappoptstatus;

	@Column(name = "product_id")
	private Integer productId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "reinves_tapp")
	private Boolean reinves_tapp;

	@Column(name = "outstanding_payout")
	private Boolean outstanding_payout;

	@Column(name = "unclamed_amt")
	private Boolean unclamedamt;

	@Column(name = "neft_reg")
	private Boolean neftreg;

	
	public Policy() {
		super();
	}

	public Integer getPolicynumber() {
		return policynumber;
	}

	public void setPolicynumber(Integer policynumber) {
		this.policynumber = policynumber;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<String> getPermiumMode() {
		return permiumMode;
	}

	public void setPermiumMode(List<String> permiumMode) {
		this.permiumMode = permiumMode;
	}

	public Set<String> getPolicystatus() {
		return policystatus;
	}

	public void setPolicystatus(Set<String> policystatus) {
		this.policystatus = policystatus;
	}

	public String getCustomerPanNum() {
		return customerPanNum;
	}

	public void setCustomerPanNum(String customerPanNum) {
		this.customerPanNum = customerPanNum;
	}

	public Integer getPolicyInsDate() {
		return policyInsDate;
	}

	public void setPolicyInsDate(Integer policyInsDate) {
		this.policyInsDate = policyInsDate;
	}

	public Integer getContNumlastupd() {
		return contNumlastupd;
	}

	public void setContNumlastupd(Integer contNumlastupd) {
		this.contNumlastupd = contNumlastupd;
	}

	public String getEmailaddlaupdate() {
		return emailaddlaupdate;
	}

	public void setEmailaddlaupdate(String emailaddlaupdate) {
		this.emailaddlaupdate = emailaddlaupdate;
	}

	public long getBankaccnum() {
		return bankaccnum;
	}

	public void setBankaccnum(long bankaccnum) {
		this.bankaccnum = bankaccnum;
	}

	public String getWhatsappoptstatus() {
		return whatsappoptstatus;
	}

	public void setWhatsappoptstatus(String whatsappoptstatus) {
		this.whatsappoptstatus = whatsappoptstatus;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Boolean getReinves_tapp() {
		return reinves_tapp;
	}

	public void setReinves_tapp(Boolean reinves_tapp) {
		this.reinves_tapp = reinves_tapp;
	}

	public Boolean getOutstanding_payout() {
		return outstanding_payout;
	}

	public void setOutstanding_payout(Boolean outstanding_payout) {
		this.outstanding_payout = outstanding_payout;
	}

	public Boolean getUnclamedamt() {
		return unclamedamt;
	}

	public void setUnclamedamt(Boolean unclamedamt) {
		this.unclamedamt = unclamedamt;
	}

	public Boolean getNeftreg() {
		return neftreg;
	}

	public void setNeftreg(Boolean neftreg) {
		this.neftreg = neftreg;
	}

	
	@Override
	public String toString() {
		return "Policy [policynumber=" + policynumber + ", customerid=" + customerid + ", customerName=" + customerName
				+ ", dob=" + dob + ", emailAddress=" + emailAddress + ", mobileNumber=" + mobileNumber
				+ ", permiumMode=" + permiumMode + ", policystatus=" + policystatus + ", customerPanNum="
				+ customerPanNum + ", policyInsDate=" + policyInsDate + ", contNumlastupd=" + contNumlastupd
				+ ", emailaddlaupdate=" + emailaddlaupdate + ", bankaccnum=" + bankaccnum + ", whatsappoptstatus="
				+ whatsappoptstatus + ", productId=" + productId + ", productName=" + productName + ", reinves_tapp="
				+ reinves_tapp + ", outstanding_payout=" + outstanding_payout + ", unclamedamt=" + unclamedamt
				+ ", neftreg=" + neftreg + ",";
	}

	
	
}
