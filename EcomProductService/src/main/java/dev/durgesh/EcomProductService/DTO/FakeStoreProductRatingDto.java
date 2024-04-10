package dev.durgesh.EcomProductService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductRatingDto {
    private double rate;
    private int count;
}

/*
 {
            "rate": 3.9,
            "count": 120
        }
 */