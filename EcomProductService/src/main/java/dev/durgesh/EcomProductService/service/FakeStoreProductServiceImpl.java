package dev.durgesh.EcomProductService.service;

import dev.durgesh.EcomProductService.client.FakeStoreClient;
import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService{ //this will call client on fakestore
    @Autowired
    private FakeStoreClient fakeStoreClient;
    @Override
    public List<FakeStoreProductResponseDTO> getAllProducts() {
        List<FakeStoreProductResponseDTO> fakeStoreProducts = fakeStoreClient.getAllProducts();
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
