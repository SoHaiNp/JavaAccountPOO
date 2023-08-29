/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.valesoft.oopbanksystem.entidade;

import com.valesoft.oopbanksystem.contaServicos.Conta;

/**
 *
 * @author luiz.gnovale
 */
public class Cliente extends Entidade {
    
    Conta conta;

    public Cliente(Conta conta, String nome, String dataDeNascimento, String idade) {
        super(nome, dataDeNascimento, idade);
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}