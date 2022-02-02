package br.com.automacaoapi.controller.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private String phone;

}
