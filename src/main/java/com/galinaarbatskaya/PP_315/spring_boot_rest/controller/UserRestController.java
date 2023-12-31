package com.galinaarbatskaya.PP_315.spring_boot_rest.controller;


import com.galinaarbatskaya.PP_315.spring_boot_rest.models.User;
import com.galinaarbatskaya.PP_315.spring_boot_rest.service.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/user")
public class UserRestController {
    private final UserServiceImpl userServiceImp;

    public UserRestController(UserServiceImpl userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserInfoById(@PathVariable Long id) {
        return ResponseEntity.ok(userServiceImp.getUserById(id));
    }

    @GetMapping("/getUserInfo")
    public ResponseEntity<User> getUserInfo(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(user);
    }
}

