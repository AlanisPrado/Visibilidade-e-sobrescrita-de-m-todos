/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author alenis
 */
public class Calculadora {
    
    public void calcula(int a, int b){
        System.out.println("Operacao com sucesso");
    }
    
}
class CalculadoraSoma extends Calculadora{
    
    @Override
    public int calcula(int a, int b){
        return a + b;
    }
}
        
