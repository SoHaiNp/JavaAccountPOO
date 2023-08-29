/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.valesoft.oopbanksystem.contaServicos;

/**
 *
 * @author luiz.gnovale
 */
public class Conta {
    
    private double saldo;
    private String codigoConta;
    private String codigoAgencia;

    public Conta(double saldo, String codigoConta, String codigoAgencia) {
        this.saldo = saldo;
        this.codigoConta = codigoConta;
        this.codigoAgencia = codigoAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositaDinheiroNaConta(double saldo, double valor) {
        this.saldo += valor;
    }
    
    public void sacaDinheiroDaConta(double saldo, double valor) {
        this.saldo -= valor;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(String codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

}