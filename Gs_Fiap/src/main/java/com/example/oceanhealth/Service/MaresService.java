package com.example.oceanhealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.oceanhealth.Repository.MaresRepository;
import com.example.oceanhealth.DTO.MaresDTO;
import com.example.oceanhealth.Model.Mares;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MaresService {

    @Autowired
    private MaresRepository maresRepository;

    public List<MaresDTO> findAll() {
        return maresRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Transactional
    public MaresDTO save(MaresDTO maresDTO) {
        Mares mares = new Mares();
        
        maresRepository.save(mares);
        return convertToDTO(mares);
    }

    private MaresDTO convertToDTO(Mares mares) {
        MaresDTO dto = new MaresDTO();
        
        return dto;
    }
}
