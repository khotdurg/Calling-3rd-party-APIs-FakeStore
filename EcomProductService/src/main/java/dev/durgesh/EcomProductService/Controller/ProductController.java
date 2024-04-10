package dev.durgesh.EcomProductService.Controller;

import dev.durgesh.EcomProductService.DTO.FakeStoreProductResponseDto;
import dev.durgesh.EcomProductService.Entity.Product;
import dev.durgesh.EcomProductService.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController  {
    @Autowired
    public ProductService productService; //field injection

    @GetMapping("/product")
    public ResponseEntity getAllProducts(){
        List<FakeStoreProductResponseDto> products =productService.getAllProducts();
        return ResponseEntity.ok(products); 
    }
}
