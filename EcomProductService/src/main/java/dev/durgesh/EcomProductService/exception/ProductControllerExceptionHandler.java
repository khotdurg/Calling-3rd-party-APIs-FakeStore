package dev.durgesh.EcomProductService.exception;

import dev.durgesh.EcomProductService.controller.CartController;
import dev.durgesh.EcomProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = CartController.class)
public class ProductControllerExceptionHandler {
//both the methods are same so that merge those in one place
    @ExceptionHandler({ProductNotFoundException.class, NoProductPresentException.class}) //for single product
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
//
//    @ExceptionHandler(NoProductPresentException.class) //for all the product list
//    public ResponseEntity handleNoProductPresentException(NoProductPresentException pe){
//        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
//                pe.getMessage(),
//                404 // for not found
//        );
//        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
//    }

    //for input wrong
    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity InvalidInputException(InvalidInputException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                400
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.BAD_REQUEST);
    }



}
