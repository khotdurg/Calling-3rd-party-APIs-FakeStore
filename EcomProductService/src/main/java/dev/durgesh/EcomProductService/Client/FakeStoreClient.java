package dev.durgesh.EcomProductService.Client;

import dev.durgesh.EcomProductService.DTO.FakeStoreProductResponseDto;
import dev.durgesh.EcomProductService.Entity.Product;
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
    //need to know the domain URL and path URl(like product url or any) storing these in
    // fakestore api in application properties
    // this annotation will, fetch the value from app properties and inject that value to this variable
    @Value("${fakestore.api.base.url}")
    private String fakeStoreAPIBaseUrl; //main domain
    @Value("${fakestore.api.product.path}")
    private String fakeStoreAPIProductPath; //path url

    public List<FakeStoreProductResponseDto> getAllProduct(){ //will return list of product
        //to make the call must create entire url
        String fakeStoreGetAllProductURL = fakeStoreAPIBaseUrl.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        //by using Rest Template i will make the call
        ResponseEntity<FakeStoreProductResponseDto[]> productResponseList =
                restTemplate.getForEntity(fakeStoreGetAllProductURL, FakeStoreProductResponseDto[].class);
        return List.of(productResponseList.getBody());
    }

}
