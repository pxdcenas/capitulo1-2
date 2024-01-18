package edu.cibertec.lab05.service;

import edu.cibertec.lab05.beans.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
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
        //System.out.println(Integer.parseInt("abc"));
        System.out.println(imprimible.imprimir());
    }
}
