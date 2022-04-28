package com.eam.edu.co.apps_angular_backened.security.repository;

import com.eam.edu.co.apps_angular_backened.security.entity.Rol;
import com.eam.edu.co.apps_angular_backened.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
