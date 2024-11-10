package com.example.demo.entity;






import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "Persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Nombre", length = 100)
	private String Nombre;
	@Column(name = "Apellido", length = 100)
	private String Apellido;
	@Column(name = "Email", length = 100)
	private String Email;
	@Column(name = "Dni", length = 8)
	private char Dni;
	@Column(name = "Estado_Persona")
	private char Estado_Persona;
	
	@OneToMany(mappedBy = "Persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Usuario>Usuario;
	
	@OneToMany(mappedBy = "Persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Representante>Representante;
	
	@OneToMany(mappedBy = "Persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Estudiante>Estudiante;
	
	@OneToMany(mappedBy = "Persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Detalle_PPP>Detalle_PPP;
	
}

