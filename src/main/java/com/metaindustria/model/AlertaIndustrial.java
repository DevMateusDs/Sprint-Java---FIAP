package com.metaindustria.model;

import jakarta.persistence.*;

@Entity
public class AlertaIndustrial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoRisco;

    private String localizacao;

    private String nivelPerigo;

    private String descricao;

    public AlertaIndustrial() {
    }

    public AlertaIndustrial(Long id, String tipoRisco, String localizacao, String nivelPerigo, String descricao) {
        this.id = id;
        this.tipoRisco = tipoRisco;
        this.localizacao = localizacao;
        this.nivelPerigo = nivelPerigo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoRisco() {
        return tipoRisco;
    }

    public void setTipoRisco(String tipoRisco) {
        this.tipoRisco = tipoRisco;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNivelPerigo() {
        return nivelPerigo;
    }

    public void setNivelPerigo(String nivelPerigo) {
        this.nivelPerigo = nivelPerigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}