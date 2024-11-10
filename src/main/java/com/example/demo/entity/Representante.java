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
@Table(name = "Representante")
public class Representante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Estado_Representante")
	private char estadoEstado_Representante;
	
	@ManyToOne
    @JoinColumn(name = "id_Persona", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Persona Persona;
	
	@ManyToOne
    @JoinColumn(name = "id_Empresa", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Empresa Empresa;
}
