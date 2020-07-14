package som.as.iservice;

import java.util.List;

import com.as.model.Product;

public interface IproductService {

	public Integer saveProduct(Product p);
	public void updateProduct(Product p);
	public void deleteProduct(Integer productId);
	public Product getProductById(Integer productId);
	public List<Product> getAllProducts();
	public boolean isProductMobileNum(Integer mobileNumber);
	public boolean isEmailOrMobileExist(String type,String userEmailOrmobile);
	
}
