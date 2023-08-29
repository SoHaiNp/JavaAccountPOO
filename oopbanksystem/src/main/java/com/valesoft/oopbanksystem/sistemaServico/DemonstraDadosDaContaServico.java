/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.valesoft.oopbanksystem.sistemaServico;

import com.valesoft.oopbanksystem.contaServicos.Conta;
import com.valesoft.oopbanksystem.entidade.Cliente;

/**
 *
 * @author luiz.gnovale
 */
public class DemonstraDadosDaContaServico {
    
    Conta conta;
    Cliente cliente;
    
    /*
    Esse método é utilizado para retornar os dados base do cliente, onde:
    1. Titular;
    2. Data de nascimento;
    3. Idade;
    4. Número da conta;
    5. Número da agência;
    6. Saldo da conta.
    */
    public void retornaDadosDaConta(Conta contaDoCliente, Cliente cliente){
        System.out.printf("| Titular:   %s\n| Data Nasc.:       %s\n| Idade:        %s\n| Nº Conta:     %s\n| Nº Agência:    %s\n| Saldo:   %.2f", cliente.getNome(), cliente.getDataDeNascimento(), cliente.getIdade(), contaDoCliente.getCodigoConta(), contaDoCliente.getCodigoAgencia(), contaDoCliente.getSaldo());
    }

}