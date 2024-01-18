package edu.cibertec.lab05.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditoriaAOP {

    @Before("execution(* imprimirDocumento(..))")
    public void antes(){
        System.out.println("antes de imprimir..");
    }

    @After("execution(* imprimirDocumento(..))")
    public void despues(){
        System.out.println("...despues de imprimir");
    }

    @AfterThrowing("execution(* imprimirDocumento(..))")
    public void excepcion(){
        System.out.println("registra en logs");
    }
}
