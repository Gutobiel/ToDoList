package br.com.gutobiel.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println("Username: " + userModel.getUsername() + " \nName: " + userModel.getName() + " \nPassword: " + userModel.getPassword());
        System.out.println("Username: " + userModel.getUsername());
        System.out.println("Password: " + userModel.getPassword());
        System.out.println("Name: " + userModel.getName());
    }
}
