/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author alenis
 */
public class Administrador extends Usuario {

    public Administrador(Documento documento) {
        super(documento);
    }

    public void editarDocumento() {
        documento.permitirEdicao();
        documento.editar();
    }

    public void abrirDocumento() {
        documento.abrir();

    }

    public void fecharDocumento() {
        documento.fechar();
    }

}
