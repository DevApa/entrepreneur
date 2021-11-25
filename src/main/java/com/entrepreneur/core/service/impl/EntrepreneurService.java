package com.entrepreneur.core.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entrepreneur.core.controllers.dto.EntrepreneurDTO;
import com.entrepreneur.core.repository.contract.IEntrepreneurRepository;
import com.entrepreneur.core.repository.model.Entrepreneur;
import com.entrepreneur.core.service.contract.IEntrepreneurService;
import com.entrepreneur.core.utils.MapModel;
import org.springframework.stereotype.Service;

@Service
public class EntrepreneurService implements IEntrepreneurService {
	
	@Autowired
	IEntrepreneurRepository _repository;
	@Override
	public List<EntrepreneurDTO> list() {		
		return MapModel.listMapModelToListDto(_repository.findAll());
	}

	
	@Override
	public EntrepreneurDTO getEntrepreneurById(int id) {
		EntrepreneurDTO entrepreneurDto = MapModel.modelToDto(_repository.getEntrepreneurById(BigInteger.valueOf(id)));		
		return entrepreneurDto;
	}

	@Override
	public EntrepreneurDTO create(EntrepreneurDTO EntrepreneurDto) {
		Entrepreneur entrepreneur = MapModel.dtoToModel(EntrepreneurDto); 
		entrepreneur.setId(null);
		return MapModel.modelToDto(_repository.save(entrepreneur));
	}

	@Override
	public EntrepreneurDTO update(EntrepreneurDTO EntrepreneurDto) {
		Entrepreneur entrepreneur = MapModel.dtoToModel(EntrepreneurDto); 
		return MapModel.modelToDto(_repository.save(entrepreneur));
	}

	@Override
	public void delete(int id) {
		_repository.deleteById(BigInteger.valueOf(id));
	}

	@Override
	public boolean exist(int id) {
		return _repository.existsById(BigInteger.valueOf(id));
	}

}
