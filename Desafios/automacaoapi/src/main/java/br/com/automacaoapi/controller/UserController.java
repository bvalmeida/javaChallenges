package br.com.automacaoapi.controller;

import br.com.automacaoapi.controller.request.UserRequest;
import br.com.automacaoapi.controller.response.UserResponse;
import br.com.automacaoapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/automacao/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> get(){
        return this.userService.getAllUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody UserRequest userRequest){
        this.userService.addUser(userRequest);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateUser(@RequestBody UserRequest userRequest){
        this.userService.updateUser(userRequest);
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePatch(@RequestBody UserRequest userRequest){
        this.userService.updateUser(userRequest);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser (@RequestParam Long id){
        this.userService.deleteUser(id);
    }

}
