package com.cibertec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.entity.TipoDocumento;
import com.cibertec.service.TipoDocumentoService;

@RestController
@RequestMapping("/rest/tipodocumento")
public class TipoDocumentoController {

	@Autowired
	private TipoDocumentoService service;

	@GetMapping()
	public ResponseEntity<?> lista() {
		List<TipoDocumento> lstSalida = service.listaTipoDocumento();
		return ResponseEntity.ok(lstSalida);
	}

	
}
