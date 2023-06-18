package com.galinaarbatskaya.PP_315.spring_boot_rest.controller;

import com.galinaarbatskaya.PP_315.spring_boot_rest.models.Role;
import com.galinaarbatskaya.PP_315.spring_boot_rest.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/admin/roles")
public class RoleRestController {
    private final RoleService roleService;
    public RoleRestController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles() {
        return ResponseEntity.ok(roleService.getAllRoles());
    }
}
