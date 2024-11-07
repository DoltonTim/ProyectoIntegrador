package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Detalle_Documento;
@Repository
public interface Detalle_Documentorepository extends JpaRepository<Detalle_Documento, Long> {

}
