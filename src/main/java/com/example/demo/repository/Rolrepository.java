package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rol;
@Repository
public interface Rolrepository extends JpaRepository<Rol, Long>{

}
