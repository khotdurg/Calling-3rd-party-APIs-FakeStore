package dev.durgesh.EcomProductService.service;

import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;

import java.util.List;

public interface ProductService { //will create CRUD
    List<FakeStoreProductResponseDTO> getAllProducts();
    Product getProduct(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct, int productId); //productId here to update particular product
    boolean deleteProduct(int productId);
}
