package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Evaluacion;
@Repository
public interface Evaluacionrepository  extends JpaRepository<Evaluacion, Long>{

}
