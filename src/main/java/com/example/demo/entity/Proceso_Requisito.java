package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Proceso_Requisito")
public class Proceso_Requisito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Responsable", length = 100)
	private String Responsable;
	@Column(name = "Estado_Proceso_Requisito")
	private char Estado_Proceso_Requisito;
	
	@ManyToOne
    @JoinColumn(name = "id_Plan_Carrera", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Plan_Carrera Plan_Carrera;
	
	@ManyToOne
    @JoinColumn(name = "id_Proceso", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Proceso Proceso;
	
	@ManyToOne
    @JoinColumn(name = "id_Requisito", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Requisito Requisito;
	
}
