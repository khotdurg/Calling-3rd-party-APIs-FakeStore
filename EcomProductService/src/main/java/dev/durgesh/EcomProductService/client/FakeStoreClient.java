package dev.durgesh.EcomProductService.client;

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

    //getAllproducts
    public List<FakeStoreProductResponseDTO> getAllProducts(){
        String fakeStoreGetAllProductURl = fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO[]> productResponselist  =
                restTemplate.getForEntity(fakeStoreGetAllProductURl, FakeStoreProductResponseDTO[].class);
        return List.of(productResponselist.getBody());
    }
}
