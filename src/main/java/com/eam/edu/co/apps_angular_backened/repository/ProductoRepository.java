package com.eam.edu.co.apps_angular_backened.repository;

import com.eam.edu.co.apps_angular_backened.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByNombre(String nombre);

    boolean existsByNombre(String nombre);
}
