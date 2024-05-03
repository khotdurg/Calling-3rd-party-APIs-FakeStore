package dev.durgesh.EcomProductService.mapper;

import dev.durgesh.EcomProductService.dto.ProductResponseDTO;
import dev.durgesh.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponse;
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setProductId(product.getId());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setCategory(product.getCategory());
        responseDTO.setRating(product.getRating());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setDescription(product.getDescription());
        return responseDTO;
    }
}
