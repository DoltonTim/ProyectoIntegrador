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
@Table(name = "Detalle_Documento")
public class Detalle_Documento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Nombre_Documento", length = 100)
	private String Nombre_Documento;
	@Column(name = "Fecha_Documento", length = 100)
	private LocalDateTime Fecha_Documento;
	@Column(name = "Estado_Detalle_Do")
	private char Estado_Detalle_Do;
	
	@ManyToOne
    @JoinColumn(name = "id_Detalle_PPP", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Detalle_PPP Detalle_PPP;
}
