package som.as.iservice;

import java.util.List;

import com.as.model.Policy;
import com.as.model.Product;

public interface IPolicyService {
	
	public Integer savePolicy(Policy p);
	public void updatePolicy(Policy p);
	public Policy getPolicyById(Integer policyId);
	public List<Policy> getAllPolicy();
	public boolean isPolicyMobileNum(Integer mobileNumber);
	public boolean isEmailOrMobileExist(String type,String userEmailOrmobile);

}
