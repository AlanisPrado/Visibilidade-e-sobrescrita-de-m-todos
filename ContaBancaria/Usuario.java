/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author alenis
 */
public class Usuario {

    protected Documento documento;

    public Usuario(Documento documento) {
        this.documento = documento;
    }
    
    

    public void abrirDocumento(Documento documento) {
        documento.abrir();
    }

    public void fecharDocumento(Documento documento) {
        documento.fechar();
    }

}
