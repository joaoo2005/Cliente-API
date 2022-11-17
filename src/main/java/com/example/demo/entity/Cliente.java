package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "O nome é obrigatorio!")
    private String nomeCompleto;
    private String profisao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cliente(String nomeCompleto, String endereco, List<Endereco> enderecos , String profisao) {
        this.nomeCompleto = nomeCompleto;
        this.enderecos = enderecos;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Endereco> getEnderecos(List<Endereco> rua) {
        return rua;
    }

    public String getProfisao() {
        return profisao;
    }

    public void setProfisao(String profisao) {
        this.profisao = profisao;
    }
}