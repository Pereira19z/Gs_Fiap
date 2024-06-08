package com.example.oceanhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oceanhealth.Model.Rio;

@Repository
public interface RioRepository extends JpaRepository<Rio, Long> {
}
