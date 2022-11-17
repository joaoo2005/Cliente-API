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
    private String profissao;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cliente(String nomeCompleto, String profissao, List<Endereco> enderecos) {
        this.nomeCompleto = nomeCompleto;
        this.enderecos = enderecos;
        this.profissao = profissao;
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

    public String getProfisao() {
        return profissao;
    }

    public void setProfisao(String profissao) {
        this.profissao = profissao;
    }

    public List<Endereco> getEnderecos(List<Endereco> rua) {
        return rua;
    }

    public void setEnderecos() {
        this.enderecos = enderecos;
    }
}