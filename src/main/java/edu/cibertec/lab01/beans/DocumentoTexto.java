package edu.cibertec.lab01.beans;

public class DocumentoTexto implements Imprimible{

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de texto";
    }
}
