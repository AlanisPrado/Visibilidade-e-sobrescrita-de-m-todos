/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visibilidade;

/**
 *
 * @author alenis
 */
public class Visibilidade extends Animal{

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Criando os objetos das subclasses
        Animal leao = new Leao();
        Animal elefante = new Elefante();
        Animal passaro = new Passaro();

        // Chamando o método emitirSom para cada um
        leao.emitirSom();
        elefante.emitirSom();
        passaro.emitirSom();
    }
}
