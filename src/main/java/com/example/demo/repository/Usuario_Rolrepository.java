package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario_Rol;
@Repository
public interface Usuario_Rolrepository extends JpaRepository<Usuario_Rol, Long> {

}
