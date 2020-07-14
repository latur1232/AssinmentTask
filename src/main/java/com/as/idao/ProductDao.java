package com.as.idao;

import java.util.List;

import com.as.model.Product;

public interface ProductDao {

	public Integer saveProduct(Product p);
	public void updateProduct(Product p);
	public Product getProductById(Integer productId);
	public List<Product> getAllProducts();
	public boolean isProductMobileNum(Integer mobileNumber);
	//public Map<Integer, String> getItemIdNameCode();

}
