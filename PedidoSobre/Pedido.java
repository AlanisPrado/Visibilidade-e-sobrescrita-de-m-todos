/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PedidoSobre;

/**
 *
 * @author alenis
 */
// Classe base Pedido
public class Pedido {
    protected double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    // Método para calcular o total (pode incluir mais lógicas como taxas adicionais)
    public double calcularTotal() {
        return valorTotal;
    }

    // Método de aplicar desconto que será sobrescrito
    public double aplicarDesconto() {
        // Sem desconto para o pedido base
        return valorTotal;
    }
}

// Subclasse PedidoComum
class PedidoComum extends Pedido {

    public PedidoComum(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public double aplicarDesconto() {
        // Desconto de 5% para pedidos comuns
        return valorTotal * 0.95;
    }
}

// Subclasse PedidoVip
class PedidoVip extends Pedido {

    public PedidoVip(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public double aplicarDesconto() {
        // Desconto de 10% para pedidos VIP
        return valorTotal * 0.90;
    }
}
