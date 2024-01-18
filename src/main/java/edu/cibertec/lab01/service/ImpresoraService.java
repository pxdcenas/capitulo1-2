package edu.cibertec.lab01.service;

import edu.cibertec.lab01.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
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
