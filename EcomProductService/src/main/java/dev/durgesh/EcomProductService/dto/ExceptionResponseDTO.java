package dev.durgesh.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponseDTO { // get back exception
    private String messege;
    private int code;

    //CONSTRUCTOR

    public ExceptionResponseDTO(String messege, int code) {
        this.messege = messege;
        this.code = code;  //ERROR CODE, http code
    }
}
