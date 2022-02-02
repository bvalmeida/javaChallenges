package br.com.automacaoapi.service;

import br.com.automacaoapi.controller.request.UserRequest;
import br.com.automacaoapi.controller.response.UserResponse;
import br.com.automacaoapi.repository.UserRepository;
import br.com.automacaoapi.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(UserRequest userRequest) {
        new User();
        this.userRepository.save(User.convertRequestToEntity(userRequest));
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return this.userRepository.findAll().stream().map(User::convertEntityToResponse).collect(Collectors.toList());
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public void updateUser(UserRequest userRequest) {
        this.userRepository.save(User.convertRequestToEntity(userRequest));
    }


}
