package edu.cibertec;

import edu.cibertec.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecutora {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ImpresoraService is = (ImpresoraService)context.getBean("impresoraXYZ");
        is.imprimirDocumento();

        ((ConfigurableApplicationContext)context).close();
    }
}
