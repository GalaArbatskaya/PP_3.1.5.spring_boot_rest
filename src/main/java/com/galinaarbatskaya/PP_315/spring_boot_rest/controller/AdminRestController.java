package com.galinaarbatskaya.PP_315.spring_boot_rest.controller;


import com.galinaarbatskaya.PP_315.spring_boot_rest.models.User;
import com.galinaarbatskaya.PP_315.spring_boot_rest.service.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {

    private final UserServiceImpl userServiceImpl;

    public AdminRestController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userServiceImpl.getAllUsers());
    }

    @PostMapping()
    public ResponseEntity<HttpStatus> addNewUser(@RequestBody User user) {
        userServiceImpl.save(user);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        userServiceImpl.update(user);

        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> removeUser(@PathVariable Long id) {
        userServiceImpl.removeUserById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
