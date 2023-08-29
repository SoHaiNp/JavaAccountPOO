/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.valesoft.oopbanksystem.entidade;

/**
 *
 * @author luiz.gnovale
 */
public class Entidade {
    
    private String nome;
    private String dataDeNascimento;
    private String idade;

    public Entidade(String nome, String dataDeNascimento, String idade) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
    
}