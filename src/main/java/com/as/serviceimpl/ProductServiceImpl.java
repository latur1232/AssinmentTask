package com.as.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.as.idao.ProductDao;
import com.as.model.Product;
import som.as.iservice.IproductService;

@Service
public class ProductServiceImpl implements IproductService {

	@Autowired
	public ProductDao dao;

	@Transactional
	public Integer saveProduct(Product p) {

		return dao.saveProduct(p);
	}

	@Transactional
	public void updateProduct(Product p) {
		dao.updateProduct(p);

	}

	@Transactional
	public void deleteProduct(Integer productId) {

	}

	@Transactional
	public Product getProductById(Integer productId) {

		return dao.getProductById(productId);
	}

	@Transactional
	public List<Product> getAllProducts() {

		return dao.getAllProducts();
	}

	@Transactional
	public boolean isProductMobileNum(Integer mobileNumber) {

		return dao.isProductMobileNum(mobileNumber);
	}

	@Transactional
	public boolean isEmailOrMobileExist(String type, String userEmailOrmobile) {
		// TODO Auto-generated method stub
		return false;
	}

}
