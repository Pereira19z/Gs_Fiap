package com.example.oceanhealth.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity
public class Mares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private String localizacao;

    @DecimalMin("0.0") @DecimalMax("14.0")
    private Double ph;

    @DecimalMin("0.0")
    private Double turbidez;

    @DecimalMin("0.0")
    private Double oxigenioDissolvido;

    @DecimalMin("0.0")
    private Double nitratos;

    @DecimalMin("0.0")
    private Double fosfatos;

    @Min(0)
    private Integer coliformesTotais;

    @Temporal(TemporalType.DATE)
    private Date dataMedicao;

    // Getters and Setters
}
