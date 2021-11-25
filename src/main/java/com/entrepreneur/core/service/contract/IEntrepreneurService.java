package com.entrepreneur.core.service.contract;

import java.util.List;

import com.entrepreneur.core.controllers.dto.EntrepreneurDTO;

public interface IEntrepreneurService {
	List<EntrepreneurDTO> list();
	EntrepreneurDTO getEntrepreneurById(int id);
	EntrepreneurDTO create(EntrepreneurDTO EntrepreneurDto);
	EntrepreneurDTO update(EntrepreneurDTO EntrepreneurDto);
	void delete(int id);
	boolean exist(int id);
}
