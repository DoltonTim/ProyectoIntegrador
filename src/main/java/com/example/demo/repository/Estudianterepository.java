package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Estudiante;
@Repository
public interface Estudianterepository extends JpaRepository<Estudiante, Long> {

}
