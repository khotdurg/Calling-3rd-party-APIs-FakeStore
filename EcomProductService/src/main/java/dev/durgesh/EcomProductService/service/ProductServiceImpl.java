package dev.durgesh.EcomProductService.service;

import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("productService")
public class ProductServiceImpl implements ProductService{
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(int productId) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product updatedProduct, int productId) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
