package com.as.daoimpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.as.idao.IPolicyDao;
import com.as.model.Policy;

@Repository
public class PolicyDaoImpl implements IPolicyDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer savePolicy(Policy p) {
		return (Integer) ht.save(p);
	}

	public void updatePolicy(Policy p) {
		ht.update(p);
	}

	public Policy getPolicyById(Integer policyId) {

		return ht.get(Policy.class, policyId);
	}
		
		@SuppressWarnings("unchecked")
		public boolean isPolicyMobileNum(Integer mobileNumber) {
			Policy q=null;
			List<Policy> P=(List<Policy>) ht.findByCriteria(
					DetachedCriteria.forClass(Policy.class)
					.add(Restrictions.eq("mobileNumber", mobileNumber))
					);
			if(P!=null && !P.isEmpty()) {
				q=P.get(0);
			}
			return true;
		}

		public boolean isEmailUalidation(String emailAddress , String dob) {
			Policy q=null;
			List<Policy> P=(List<Policy>) ht.findByCriteria(
					DetachedCriteria.forClass(Policy.class)
					.add(Restrictions.eq("emailAddress", emailAddress))
					.add(Restrictions.eq("dob", dob))
					);
			if(P!=null && !P.isEmpty()) {
				q=P.get(0);
			}

			return false;
		}

	}


