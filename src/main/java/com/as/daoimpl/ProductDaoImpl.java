package com.as.daoimpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


import com.as.idao.ProductDao;
import com.as.model.Policy;
import com.as.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate ht;

	public Integer saveProduct(Product p) {
		
		return (Integer) ht.save(p);
	}

	public void updateProduct(Product p) {
		ht.update(p);
		
	}

	public Product getProductById(Integer productId) {
	
		return ht.get(Product.class, productId);
	}

	public List<Product> getAllProducts() {

			return ht.loadAll(Product.class);
		}
		
		@SuppressWarnings("unchecked")
		public boolean isProductMobileNum(Integer mobileNumber) { {
			Policy q=null;
			List<Policy> P=(List<Policy>) ht.findByCriteria(
					DetachedCriteria.forClass(Policy.class)
					.add(Restrictions.eq("mobileNumber", mobileNumber))
					);
			if(P!=null && !P.isEmpty()) {
				q=P.get(0);
			}
			return true;
		}	}

}

	

