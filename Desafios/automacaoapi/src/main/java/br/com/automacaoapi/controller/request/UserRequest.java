package br.com.automacaoapi.controller.request;

import lombok.Data;

@Data
public class UserRequest {

    private String name;
    private String email;
    private String phone;

}
