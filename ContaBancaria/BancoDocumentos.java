/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author alenis
 */
public class BancoDocumentos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc = new Documento();

        Administrador admin = new Administrador(doc);
        Visitante visitante = new Visitante(doc);

        // Administrador acessando o documento
        admin.abrirDocumento();
        admin.editarDocumento();
        admin.fecharDocumento();

        // Visitante tentando acessar o documento
        visitante.abrirDocumento();
        visitante.fecharDocumento();
    }

}
