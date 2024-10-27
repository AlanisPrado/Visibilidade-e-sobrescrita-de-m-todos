/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visibilidade.Funcionarios;

/**
 *
 * @author alenis
 */
public class Empresa extends Funcionario{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Criando os objetos das subclasses
        Funcionario engenheiro = new Engenheiro();
        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();

        // Chamando os métodos para cada tipo de funcionário
        engenheiro.trabalhar();
        engenheiro.receberSalario();

        vendedor.trabalhar();
        vendedor.receberSalario();

        gerente.trabalhar();
        gerente.receberSalario();
    }
    
}
