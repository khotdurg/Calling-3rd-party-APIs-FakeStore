package dev.durgesh.EcomProductService.Mapper;

import dev.durgesh.EcomProductService.DTO.ProductResponseDto;
import dev.durgesh.EcomProductService.Entity.Product;

public class ProductEntityDtoMapper {
    public static ProductResponseDto convertProductEntityToProductResponseDto(Product product){
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setProductId(product.getId());
        responseDto.setTitle(product.getTitle());
        responseDto.setCategory(product.getCategory());
        responseDto.setRating(product.getRating());
        responseDto.setPrice(product.getPrice());
        responseDto.setImageURL(product.getImageURL());
        responseDto.setDescription(product.getDescription());
        return responseDto;
    }
}
