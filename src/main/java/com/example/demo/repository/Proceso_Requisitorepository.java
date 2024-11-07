package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Proceso_Requisito;
@Repository
public interface Proceso_Requisitorepository extends JpaRepository<Proceso_Requisito, Long> {

}
