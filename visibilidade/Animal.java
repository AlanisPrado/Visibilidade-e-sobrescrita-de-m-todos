/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visibilidade;

// Superclasse Animal
class Animal {
    // Método que será sobrescrito pelas subclasses
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

// Subclasse Leão
class Leao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O leao ruge!");
    }
}

// Subclasse Elefante
class Elefante extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O elefante tromba!");
    }
}

// Subclasse Pássaro
class Passaro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O passaro canta!");
    }
}

// Classe principal para testar

