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
@Table(name = "Detalle_PPP")
public class Detalle_PPP {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Estado_Detalle_PPP")
	private char Estado_Detalle_PPP;
	
	@ManyToOne
    @JoinColumn(name = "id_Proceso", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Proceso  Proceso;
	
	@ManyToOne
    @JoinColumn(name = "id_PPP", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private PPP  PPP;
	
	@OneToMany(mappedBy = "Detalle_PPP", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Detalle_Documento> Detalle_Documento;
	

	
	@ManyToOne
    @JoinColumn(name = "id_Persona", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Persona  Persona;
	
	@ManyToOne
    @JoinColumn(name = "id_Requisito", nullable = false) // Aquí "facultad_id" es el nombre de la columna en la base de datos
    private Requisito  Requisito;
}
