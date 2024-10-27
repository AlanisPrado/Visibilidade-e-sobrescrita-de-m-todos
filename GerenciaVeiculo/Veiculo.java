/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GerenciaVeiculo;

/**
 *
 * @author alenis
 */
// Classe base Veiculo
public abstract class Veiculo {
    private int velocidade;

    public Veiculo() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Métodos abstratos para serem implementados pelas subclasses
    public abstract void acelerar();
    public abstract void frear();
}

// Subclasse Carro
class Carro extends Veiculo {
    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println("Carro acelerou. Velocidade atual: " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 10);
        if (getVelocidade() < 0) setVelocidade(0);
        System.out.println("Carro freou. Velocidade atual: " + getVelocidade() + " km/h");
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 15);
        System.out.println("Moto acelerou. Velocidade atual: " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 15);
        if (getVelocidade() < 0) setVelocidade(0);
        System.out.println("Moto freou. Velocidade atual: " + getVelocidade() + " km/h");
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 5);
        System.out.println("Bicicleta acelerou. Velocidade atual: " + getVelocidade() + " km/h");
    }

    @Override
    public void frear() {
        setVelocidade(getVelocidade() - 5);
        if (getVelocidade() < 0) setVelocidade(0);
        System.out.println("Bicicleta freou. Velocidade atual: " + getVelocidade() + " km/h");
    }
}

