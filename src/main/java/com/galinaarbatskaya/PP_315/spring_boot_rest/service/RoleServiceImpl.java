package com.galinaarbatskaya.PP_315.spring_boot_rest.service;

import com.galinaarbatskaya.PP_315.spring_boot_rest.models.Role;
import com.galinaarbatskaya.PP_315.spring_boot_rest.repositiries.RoleRepository;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
