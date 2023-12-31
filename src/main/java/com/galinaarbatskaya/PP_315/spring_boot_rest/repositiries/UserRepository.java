package com.galinaarbatskaya.PP_315.spring_boot_rest.repositiries;


import com.galinaarbatskaya.PP_315.spring_boot_rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u left join fetch u.roles where u.email=:email")
    Optional<User> findByEmail(@Param("email") String email);




}
