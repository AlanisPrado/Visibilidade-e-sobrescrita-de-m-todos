/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author alenis
 */
public class Documento {
    private boolean aberto;
    private boolean editavel;

    public Documento() {
        this.aberto = false;
        this.editavel = false;
    }

    public void abrir() {
        this.aberto = true;
        System.out.println("Documento aberto.");
    }

    public void fechar() {
        this.aberto = false;
        this.editavel = false;
        System.out.println("Documento fechado.");
    }

    protected void editar() {
        if (this.aberto && this.editavel) {
            System.out.println("Editando o documento...");
        } else if (!this.aberto) {
            System.out.println("O documento precisa estar aberto para ser editado.");
        } else {
            System.out.println("Você não tem permissão para editar este documento.");
        }
    }

    protected void permitirEdicao() {
        this.editavel = true;
    }
}
