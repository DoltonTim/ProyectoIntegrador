package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Razon_Social", length = 100)
	private String Razon_Social;
	@Column(name = "Direccion", length = 100)
	private String Direccion;
	@Column(name = "Email", length = 100)
	private String Email;
	@Column(name = "Telefono", length = 100)
	private String  Telefono;
	@Column(name = "Estado_Empresa")
	private char Estado_Empresa;
}

