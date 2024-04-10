package dev.durgesh.EcomProductService.Service;

import dev.durgesh.EcomProductService.DTO.FakeStoreProductResponseDto;
import dev.durgesh.EcomProductService.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    List<FakeStoreProductResponseDto> getAllProducts();
    Product getProduct(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct, int productId);
    boolean deleteProduct(int productId);
}
