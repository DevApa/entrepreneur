package com.entrepreneur.core.controllers.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.entrepreneur.core.constants.ErrorsMessages;
import com.entrepreneur.core.controllers.contract.IEntrepreneurController;
import com.entrepreneur.core.controllers.dto.EntrepreneurDTO;
import com.entrepreneur.core.service.impl.EntrepreneurService;

public class EntrepreneurControllerImpl implements IEntrepreneurController {
	@Autowired
	EntrepreneurService _service;
	private static final Logger log = LoggerFactory.getLogger(EntrepreneurControllerImpl.class);

	@Override
	public ResponseEntity<?> list() {
		try {
			List<EntrepreneurDTO> entrepreneurs = _service.list();
			if (entrepreneurs.isEmpty()) {
				log.info("La consulta no devolvió registros");
				return new ResponseEntity<String>(ErrorsMessages.ERROR_NO_CONTENT, HttpStatus.NO_CONTENT);	
			}
			return new ResponseEntity<List<EntrepreneurDTO>>(HttpStatus.OK);
		}catch (Exception e) {
			log.error("Error:" + e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@Override
	public ResponseEntity<?> entrepreneurById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> create(EntrepreneurDTO entrepreneurDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> update(EntrepreneurDTO entrepreneurDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
