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
@Table(name = "Usuario_Rol")
public class Usuario_Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Estado_Usuario_Rol")
	private char Estado_Usuario_Rol;
	
	@ManyToOne
    @JoinColumn(name = "id_Rol", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Rol Rol;
	@ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Usuario Usuario;
	
}
