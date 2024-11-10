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
@Table(name = "Plan_Carrera")
public class Plan_Carrera {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Estado_Plan_Carrera")
	private char Estado_Plan_Carrera;
	
	
	@ManyToOne
    @JoinColumn(name = "id_Plan", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Plan Plan;
	
	
	@OneToMany(mappedBy = "Plan_Carrera", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Matricula>Matricula;
	
	@ManyToOne
    @JoinColumn(name = "id_carrera", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Carrera Carrera;
	
	@OneToMany(mappedBy = "Plan_Carrera", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Detalle_Evaluacion>Detalle_Evaluacion;
	
	@OneToMany(mappedBy = "Plan_Carrera", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<PPP>PPP;
	
	@OneToMany(mappedBy = "Plan_Carrera", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Proceso_Requisito>Proceso_Requisito;
}
