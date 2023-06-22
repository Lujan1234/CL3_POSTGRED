package com.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_tipo_documento")
public class TipoDocumento {

	@Id
	@Column(name = "idTipoDocumento")
	private int idTipoDocumento;

	@Column(name = "descripcion")
	private String descripcion;

}
