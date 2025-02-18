package dev.durgesh.EcomProductService.controller;

import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import dev.durgesh.EcomProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    @Qualifier("fakeStoreProductService")
    private ProductService productService; //field injection

    @GetMapping("/product") //get all the product
    public ResponseEntity getAllProducts(){
        List<FakeStoreProductResponseDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/product/{id}") //for get a particular product/id
    public ResponseEntity getProductById(@PathVariable("id") int id){
        FakeStoreProductResponseDTO product = productService.getProduct(id);
        return ResponseEntity.ok(product);
    }
}






















