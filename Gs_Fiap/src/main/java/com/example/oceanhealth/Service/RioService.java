package com.example.oceanhealth.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.oceanhealth.Repository.RioRepository;
import com.example.oceanhealth.DTO.RioDTO;
import com.example.oceanhealth.Model.Rio;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RioService {

    @Autowired
    private RioRepository rioRepository;

    public List<RioDTO> findAll() {
        return rioRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Transactional
    public RioDTO save(RioDTO rioDTO) {
        Rio rio = new Rio();
        // Set all fields from rioDTO to rio
        // ...
        rioRepository.save(rio);
        return convertToDTO(rio);
    }

    private RioDTO convertToDTO(Rio rio) {
        RioDTO dto = new RioDTO();
        // Set all fields from rio to dto
        // ...
        return dto;
    }
}
