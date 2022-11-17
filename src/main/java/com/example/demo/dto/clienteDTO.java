package com.example.demo.dto;

public class clienteDTO {
    private String enderecos;

    public clienteDTO() {
    }

    public clienteDTO(String enderecos) {
        this.enderecos = enderecos;
    }

    public String getEndereco() {
        return enderecos;
    }

    public void setEndereco(String enderecos) {
        this.enderecos = enderecos;
    }
}
