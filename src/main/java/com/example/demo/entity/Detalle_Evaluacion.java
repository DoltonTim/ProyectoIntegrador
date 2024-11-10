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
@Table(name = "Detale_Evaluacion")
public class Detalle_Evaluacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Peso", length = 100)
	private  Double Peso;
	@Column(name = "Estado_Evaluacion")
	private char Estado_Evaluacion;
	
	
	@ManyToOne
    @JoinColumn(name = "id_Plan_Carrera", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Plan_Carrera Plan_Carrera;
	
	@ManyToOne
    @JoinColumn(name = "id_Rubro", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Rubro Rubro;
	
	

}
