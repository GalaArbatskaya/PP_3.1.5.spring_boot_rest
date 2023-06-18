package com.galinaarbatskaya.PP_315.spring_boot_rest.repositiries;

import com.galinaarbatskaya.PP_315.spring_boot_rest.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
