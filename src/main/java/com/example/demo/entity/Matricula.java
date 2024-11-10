package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Matricula")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Fecha_Matricula", length = 100)
	private LocalDateTime Fecha_Matricula;
	@Column(name = "Estado_Matricula")
	private char Estado_Matricula;
	
	@ManyToOne
    @JoinColumn(name = "id_estudiante", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Estudiante Estudiante;
	
	
	@OneToMany(mappedBy = "Matricula", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<PPP>PPP;
	
	@ManyToOne
    @JoinColumn(name = "id_Plan_Carrera", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Plan_Carrera Plan_Carrera;
}

