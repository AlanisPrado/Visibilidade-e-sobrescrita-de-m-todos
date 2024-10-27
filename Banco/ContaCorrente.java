/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author alenis
 */
public class ContaCorrente extends ContaBancaria {

    private double valor;
    private int bonus;
    private double saldo;

    
    public void saldoBancario(double saldo){
        this.saldo = saldo;
        saldo = 0;
    }
    public void sacar(double valor){
        this.valor = valor;
        
        
    }

}
