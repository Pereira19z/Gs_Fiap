package com.example.oceanhealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.oceanhealth.Repository.OceanosRepository;
import com.example.oceanhealth.DTO.OceanosDTO;
import com.example.oceanhealth.Model.Oceanos;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OceanosService {

    @Autowired
    private OceanosRepository oceanosRepository;

    public List<OceanosDTO> findAll() {
        return oceanosRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Transactional
    public OceanosDTO save(OceanosDTO oceanosDTO) {
        Oceanos oceanos = new Oceanos();
        
        oceanosRepository.save(oceanos);
        return convertToDTO(oceanos);
    }

    private OceanosDTO convertToDTO(Oceanos oceanos) {
        OceanosDTO dto = new OceanosDTO();
        
        return dto;
    }
}
