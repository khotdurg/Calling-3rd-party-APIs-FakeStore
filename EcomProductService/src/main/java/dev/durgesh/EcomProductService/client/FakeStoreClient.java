package dev.durgesh.EcomProductService.client;

import dev.durgesh.EcomProductService.dto.FakeStoreCartResponseDTO;
import dev.durgesh.EcomProductService.dto.FakeStoreProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Component
public class FakeStoreClient {
    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakestore.api.base.url}")
    private String fakeStoreAPIBaseURL; //for fetching/storing domain
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath; //for path url
    @Value("${fakestore.api.cart.for.user.path}")
    private String fakeStoreAPICartForUser;

    //getAllproducts
    public List<FakeStoreProductResponseDTO> getAllProducts(){  //all product
        String fakeStoreGetAllProductURl = fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        //inorder to get list of products that's why we use array[]
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponselist  =
                restTemplate.getForEntity(fakeStoreGetAllProductURl, FakeStoreProductResponseDTO[].class);
        return List.of(productResponselist.getBody());
    }

    // particular product/ single product
    public FakeStoreProductResponseDTO getProductById(int id){
        //URL: https://fakestoreapi.com//products/id
        String fakeStoreGetProductURL = fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath).concat("/"+id);
        RestTemplate restTemplate = restTemplateBuilder.build();
        //inorder to get the single product so that we are not using []
        ResponseEntity<FakeStoreProductResponseDTO> productResponse =
                restTemplate.getForEntity(fakeStoreGetProductURL, FakeStoreProductResponseDTO.class);
        return productResponse.getBody();
    }

    //Get cart as per userId
    public List<FakeStoreCartResponseDTO> getCartByUserId(int userId){
        // url - https://fakestoreapi.com/carts?userId=1
        if(userId < 1)
            return null;
        String fakeStoreGetCartForUser = fakeStoreAPIBaseURL.concat(fakeStoreAPICartForUser).concat(String.valueOf(userId));
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreCartResponseDTO[]> cartResponse =
                restTemplate.getForEntity(fakeStoreGetCartForUser, FakeStoreCartResponseDTO[].class);
        return List.of(cartResponse.getBody());
    }
}
