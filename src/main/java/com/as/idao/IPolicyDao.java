package com.as.idao;

import java.util.List;

import com.as.model.Policy;
import com.as.model.Product;

public interface IPolicyDao {
	
	public Integer savePolicy(Policy p);
	public void updatePolicy(Policy p);
	public Policy getPolicyById(Integer policyId);
	public boolean isPolicyMobileNum(Integer mobileNumber);
	public boolean isEmailUalidation(String emailAddress, String dob) ;


}
