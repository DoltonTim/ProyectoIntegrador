package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rol_Acceso;
@Repository
public interface Rol_Accesorepository extends JpaRepository<Rol_Acceso, Long>{

}
