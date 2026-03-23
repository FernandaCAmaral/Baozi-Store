package com.uninter.demo.model;

import jakarta.persistence.*; //Importa as anotações que mapeiam o banco de dados

@Entity //Denomina que esta classe é uma tabela no banco de dados
public class Cliente {
    @Id //Define que este campo é uma Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String clienteDesde; //Armazena a data do cadastro

    // Construtores
    public Cliente() {}

    //Getters e setters, permitee que o Spring leia e escreva os dados
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getClienteDesde() { return clienteDesde; }
    public void setClienteDesde(String clienteDesde) { this.clienteDesde = clienteDesde; }
}