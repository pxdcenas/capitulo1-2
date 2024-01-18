package edu.cibertec.lab03.service;

import edu.cibertec.lab03.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ImpresoraService {

    // Property
    @Autowired
    @Qualifier("documentoExcel")
    private Imprimible imprimible;


    // Constructor
    /*@Autowired
    public ImpresoraService(@Qualifier("documentoExcel") Imprimible imprimible) {
        this.imprimible = imprimible;
    }
     */

    // Set
    /*
    @Autowired
    public void setImprimible(@Qualifier("documentoExcel") Imprimible imprimible) {
        this.imprimible = imprimible;
    }
     */

    public void imprimirDocumento(){
        System.out.println(imprimible.imprimir());
    }
}
