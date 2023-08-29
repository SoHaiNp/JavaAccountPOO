/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.valesoft.oopbanksystem;

import com.valesoft.oopbanksystem.contaServicos.Conta;
import com.valesoft.oopbanksystem.entidade.Cliente;
import com.valesoft.oopbanksystem.sistemaServico.DemonstraDadosDaContaServico;

/**
 *
 * @author luiz.gnovale
 */
public class Oopbanksystem {

    public static void main(String[] args) {

        Conta contaCliente1 = new Conta(3245.00, "04042000", "200-1");
        Cliente cliente1 = new Cliente(contaCliente1, "Cliente 1", "2000-04-04", "23");
        DemonstraDadosDaContaServico consultaDadosCliente1 = new DemonstraDadosDaContaServico();
        
        consultaDadosCliente1.retornaDadosDaConta(contaCliente1, cliente1);
    }
}
