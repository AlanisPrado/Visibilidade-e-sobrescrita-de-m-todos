/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author alenis
 */
public class Visitante extends Usuario {

    public Visitante(Documento documento) {
        super(documento);
    }

    @Override
    public void fecharDocumento(Documento documento) {
        super.fecharDocumento(documento);
    }

    @Override
    public void abrirDocumento(Documento documento) {
        super.abrirDocumento(documento);

    }

    void fecharDocumento() {
        documento.fechar();
    }

    void abrirDocumento() {
        documento.abrir();
    }
}
