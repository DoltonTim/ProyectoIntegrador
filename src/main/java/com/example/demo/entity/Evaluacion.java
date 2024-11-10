package com.example.demo.entity;

import java.time.LocalDateTime;

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
@Table(name = "Evaluacion")
public class Evaluacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Fecha", length = 100)
	private LocalDateTime Fecha;
	@Column(name = "Descripcion", length = 300)
	private String Descripcion;
	@Column(name = "Estado_Evaluacion")
	private char Estado_Evaluacion;
	
	
	@ManyToOne
    @JoinColumn(name = "id_Rubro", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Rubro Rubro;
	
	@ManyToOne
    @JoinColumn(name = "id_PPP", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private PPP PPP;
}
