package com.entrepreneur.core.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

import com.entrepreneur.core.controllers.dto.EntrepreneurDTO;
import com.entrepreneur.core.repository.model.Entrepreneur;
import com.entrepreneur.core.utils.MapModel;

public class MapModel {
	public static final EntrepreneurDTO modelToDto(Entrepreneur entrepreneur) {
        return new ModelMapper().map(entrepreneur, EntrepreneurDTO.class);
    }

    public static final Entrepreneur dtoToModel(EntrepreneurDTO entrepreneurDto) {
        return new ModelMapper().map(entrepreneurDto, Entrepreneur.class);
    }

    public static final List<EntrepreneurDTO> listMapModelToListDto(List<Entrepreneur> Entrepreneurs) {
        return Entrepreneurs.stream().map(MapModel::modelToDto).collect(Collectors.toList());
    }

    public static final List<Entrepreneur> listMapDtoToListModel(List<EntrepreneurDTO> EntrepreneursDto) {
        return EntrepreneursDto.stream().map(MapModel::dtoToModel).collect(Collectors.toList());
    }
}
