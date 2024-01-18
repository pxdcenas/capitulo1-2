package edu.cibertec.lab05.beans;

public class DocumentoExcel implements Imprimible {
    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de excel";
    }

    public void iniciar(){
        System.out.println("Iniciando la construcción del bean");
    }

    public void destruir(){
        System.out.println("Destruyendo el bean creado");
    }
}
