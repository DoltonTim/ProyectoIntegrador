package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Detalle_PPP;
@Repository
public interface Detalle_PPPrepository  extends JpaRepository<Detalle_PPP, Long>{

}
