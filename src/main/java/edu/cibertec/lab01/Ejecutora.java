package edu.cibertec.lab01;

import edu.cibertec.lab01.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecutora {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ImpresoraService is = (ImpresoraService)context.getBean("impresoraService");
        is.imprimirDocumento();
        System.out.println(is.hashCode());

        ImpresoraService is1 = (ImpresoraService)context.getBean("impresoraService");
        is1.imprimirDocumento();
        System.out.println(is1.hashCode());

        ImpresoraService is2 = (ImpresoraService)context.getBean("impresoraService");
        is2.imprimirDocumento();
        System.out.println(is2.hashCode());

        ((ConfigurableApplicationContext)context).close();
    }
}
