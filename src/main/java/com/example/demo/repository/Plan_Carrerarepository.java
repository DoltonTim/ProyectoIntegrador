package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Plan_Carrera;
@Repository
public interface Plan_Carrerarepository  extends JpaRepository<Plan_Carrera, Long>{

}
