package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Empresa;
import com.example.demo.service.Empresaservice;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/Empresa")
public class Empresacontroller {
	@Autowired
    private Empresaservice service;

    @GetMapping
    public ResponseEntity<List<Empresa>> readAll() {
        try {
            List<Empresa> lista = service.readAll();
            if (lista.isEmpty()) {
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(lista, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Empresa> create(@Valid @RequestBody Empresa obj) {
        try {
        	Empresa objeto = service.create(obj);
            return new ResponseEntity<>(objeto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable Long id) {
        try {
            Optional<Empresa> objeto = service.read(id);
            if (objeto.isPresent()) {
                return new ResponseEntity<>(objeto.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
  	public ResponseEntity<Empresa> updateEmpresa(@PathVariable Long id, @Valid @RequestBody Empresa obj) {
  	    Optional<Empresa> objeto = service.read(id);
  	    if (objeto.isPresent()) {
  	        // Aquí se asume que el servicio actualiza el objeto y lo retorna
  	    	Empresa actualizado = service.update(obj);
  	        return new ResponseEntity<>(actualizado, HttpStatus.OK);
  	    } else {
  	        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 si no se encuentra el objeto
  	    }		
  	}

}