package edu.cibertec.service;

import edu.cibertec.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ImpresoraService {

    @Autowired
    @Qualifier("documentoT")
    private Imprimible imprimible;

    public void imprimirDocumento(){
        System.out.println(imprimible.imprimir());
    }

    public Imprimible getImprimible() {
        return imprimible;
    }

    public void setImprimible(Imprimible imprimible) {
        this.imprimible = imprimible;
    }
}
