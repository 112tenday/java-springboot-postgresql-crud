package com.iwan.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iwan.crud.model.User;
import com.iwan.crud.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userid}")
    public ResponseEntity<User> getUserById(@PathVariable Long userid) {
        User user = userService.getUserById(userid);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/save")
    public ResponseEntity<List<User>> saveUsers(@RequestBody List<User> users) {
        List<User> savedUsers = userService.saveUsers(users);
        return ResponseEntity.ok(savedUsers);
    }

    @DeleteMapping("/delete/{userid}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userid) {
        userService.deleteUser(userid);
        return ResponseEntity.ok("User deleted successfully");
    }
}
