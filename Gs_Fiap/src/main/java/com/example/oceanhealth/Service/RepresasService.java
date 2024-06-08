package com.example.oceanhealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.oceanhealth.Repository.RepresasRepository;
import com.example.oceanhealth.DTO.RepresasDTO;
import com.example.oceanhealth.Model.Represas;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RepresasService {

    @Autowired
    private RepresasRepository represasRepository;

    public List<RepresasDTO> findAll() {
        return represasRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Transactional
    public RepresasDTO save(RepresasDTO represasDTO) {
        Represas represas = new Represas();
        
        represasRepository.save(represas);
        return convertToDTO(represas);
    }

    private RepresasDTO convertToDTO(Represas represas) {
        RepresasDTO dto = new RepresasDTO();
        
        return dto;
    }
}
