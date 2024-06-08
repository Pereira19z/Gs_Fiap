package com.example.oceanhealth.DTO;

import java.util.Date;

import lombok.Data;

@Data
public class RioDTO {

    private Long id;
    private String nome;
    private String localizacao;
    private Double ph;
    private Double turbidez;
    private Double oxigenioDissolvido;
    private Double nitratos;
    private Double fosfatos;
    private Integer coliformesTotais;
    private Date dataMedicao;
}
