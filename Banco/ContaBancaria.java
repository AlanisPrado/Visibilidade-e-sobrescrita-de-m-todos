/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import java.util.Scanner;

/**
 *
 * @author alenis
 */
public class ContaBancaria {

    Scanner scan = new Scanner(System.in);
    private int decisao;
    private double valor;
    private double valorDepositar;

    public void sacar(double valor) {
        System.out.print("Valor desejavel:  ");
        valor = scan.nextDouble();

        if (valor > 0) {
            System.out.println("Sacando " + valor);
        } else {
            System.out.println("Saldo insuficiente...");
        }

    }

    public void depositar(double valor) {
        System.out.print("Qual sera o valor para o deposito: ");
        valorDepositar = scan.nextDouble();
        System.out.println("Foi depositado: " + valorDepositar);

    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public int getDecisao() {
        return decisao;
    }

    public void setDecisao(int decisao) {
        this.decisao = decisao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorDepositar() {
        return valorDepositar;
    }

    public void setValorDepositar(double valorDepositar) {
        this.valorDepositar = valorDepositar;
    }

}
