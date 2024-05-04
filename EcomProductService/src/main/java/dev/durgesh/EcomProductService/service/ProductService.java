package dev.durgesh.EcomProductService.service;

import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import dev.durgesh.EcomProductService.exception.ProductNotFoundException;

import java.util.List;

public interface ProductService { //will create CRUD
    List<FakeStoreProductResponseDTO> getAllProducts(); //list of product
    FakeStoreProductResponseDTO getProduct(int productId) throws ProductNotFoundException;//single product
    Product createProduct(Product product);
    Product updateProduct(Product updatedProduct, int productId); //productId here to update particular product
    boolean deleteProduct(int productId);
}
