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
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Login", length = 100)
	private String Login;
	@Column(name = "Clave", length = 100)
	private String Clave;
	@Column(name = "Estado_Usuario")
	private char Estado_Usuario;
	
	@OneToMany(mappedBy = "Usuario", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Usuario_Rol>Usuario_Rol;
	

	@ManyToOne
    @JoinColumn(name = "id_Persona", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Persona Persona;
}
