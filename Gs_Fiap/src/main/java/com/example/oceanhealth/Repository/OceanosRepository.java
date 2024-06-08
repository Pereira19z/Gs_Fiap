package com.example.oceanhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oceanhealth.Model.Oceanos;


@Repository
public interface OceanosRepository extends JpaRepository<Oceanos, Long> {
}
