package dev.durgesh.EcomProductService.Service;

import dev.durgesh.EcomProductService.Client.FakeStoreClient;
import dev.durgesh.EcomProductService.DTO.FakeStoreProductResponseDto;
import dev.durgesh.EcomProductService.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductServiceImpl implements ProductService{
    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakeStoreProductResponseDto> getAllProducts() {
        List<FakeStoreProductResponseDto> fakeStoreProducts = fakeStoreClient.getAllProduct();
        return fakeStoreProducts;
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
