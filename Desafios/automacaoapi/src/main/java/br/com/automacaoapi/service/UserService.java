package br.com.automacaoapi.service;

import br.com.automacaoapi.controller.request.UserRequest;
import br.com.automacaoapi.controller.response.UserResponse;
import br.com.automacaoapi.user.User;

import java.util.List;

public interface UserService {

    void addUser(UserRequest userRequest);
    List<UserResponse> getAllUsers();
    void deleteUser(Long id);
    void updateUser(UserRequest userRequest);

}
