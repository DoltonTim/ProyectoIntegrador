package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rubro;
@Repository
public interface Rubrorepository extends JpaRepository<Rubro, Long> {

}
