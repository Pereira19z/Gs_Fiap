package com.example.oceanhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oceanhealth.Model.Mares;


@Repository
public interface MaresRepository extends JpaRepository<Mares, Long> {
}
