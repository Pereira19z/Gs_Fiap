package com.example.oceanhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.oceanhealth.Model.Represas;

@Repository
public interface RepresasRepository extends JpaRepository<Represas, Long> {
}
