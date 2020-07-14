package com.as.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.as.idao.IPolicyDao;
import com.as.model.Policy;

import som.as.iservice.IPolicyService;

@Service
public class PolicyServiceImpl implements IPolicyService {

	@Autowired
	public IPolicyDao dao;
	@Transactional
	public Integer savePolicy(Policy p) {
		
		return dao.savePolicy(p);
	}

	@Transactional
	public void updatePolicy(Policy p) {
		dao.updatePolicy(p);
		
	}

	@Transactional
	public Policy getPolicyById(Integer policyId) {
		
	       return dao.getPolicyById(policyId);
	}


	@Transactional
	public boolean isPolicyMobileNum(Integer mobileNumber) {
		
		return dao.isPolicyMobileNum(mobileNumber);
	}
	@Transactional
	public boolean isEmailOrMobileExist(String PolicyNumber, String EmailOrmobile) {
		
		return false;
	}
	@Transactional
	public List<Policy> getAllPolicy() {
		
		return null;
	}

}
