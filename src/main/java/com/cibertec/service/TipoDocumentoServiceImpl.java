package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.TipoDocumento;
import com.cibertec.repository.TipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

	@Autowired
	private TipoDocumentoRepository repository;

	@Override
	public List<TipoDocumento> listaTipoDocumento() {
		return repository.findAll();
	}

	
}
