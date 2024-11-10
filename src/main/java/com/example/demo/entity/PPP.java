package com.example.demo.entity;

import java.time.LocalDate;
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
@Table(name = "PPP")
public class PPP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fecha_inicio", length = 100)
	private LocalDate fecha_inicio;
	@Column(name = "fecha_final", length = 100)
	private LocalDate fecha_final;
	@Column(name = "HORAS", length = 10 )
	private double HORAS;
	@Column(name = "Codigo", length = 100)
	private String Codigo;
	@Column(name = "Promedio", length = 100)
	private double Promedio;
	@Column(name = "Estado")
	private char Estado;
	
	@ManyToOne
    @JoinColumn(name = "id_Empresa", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Empresa Empresa;
	
	@ManyToOne
    @JoinColumn(name = "id_Linea", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Linea Linea;
	
	@ManyToOne
    @JoinColumn(name = "id_Matricula", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Matricula Matricula;
	
	
	@ManyToOne
    @JoinColumn(name = "id_Plan_Carrera", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Plan_Carrera Plan_Carrera;
	
	@OneToMany(mappedBy = "PPP", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Detalle_PPP>Detalle_PPP;
	
	@OneToMany(mappedBy = "PPP", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Evaluacion>Evaluacion;
}
