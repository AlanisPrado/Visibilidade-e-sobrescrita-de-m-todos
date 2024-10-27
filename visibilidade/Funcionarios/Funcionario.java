/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visibilidade.Funcionarios;

/**
 *
 * @author alenis
 */
public class Funcionario {

    public void trabalhar() {
        System.out.println("O funcionario trabalha");
    }

    public void receberSalario() {
        System.out.println("Funcionario recebe salario");
    }
}

// Subclasse Engenheiro
class Engenheiro extends Funcionario {
    

    @Override
    public void trabalhar() {
        System.out.println("Engenheiro trabalha naSchaeffler");
    }

    @Override
    public void receberSalario() {
        System.out.println("recebe 5.000");
    }
}

// Subclasse Vendedor
class Vendedor extends Funcionario {

    @Override
    public void trabalhar() {
        System.out.println("Vendedor trabalha na Americanas");
    }

    @Override
    public void receberSalario() {
        System.out.println("recebe 2.000");
    }
}

// Subclasse Gerente
class Gerente extends Funcionario {

    @Override
    public void trabalhar() {
        System.out.println("Gerente trabalha na Huawei");
    }

    @Override
    public void receberSalario() {
        System.out.println("recebe 8.000");
    }
}

// Classe principal para testar

