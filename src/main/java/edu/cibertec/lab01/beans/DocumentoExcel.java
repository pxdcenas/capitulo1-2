package edu.cibertec.lab01.beans;

public class DocumentoExcel implements Imprimible{
    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de excel";
    }
}
