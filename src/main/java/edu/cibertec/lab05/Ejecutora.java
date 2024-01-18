package edu.cibertec.lab05;

import edu.cibertec.lab05.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ejecutora {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Beans : " + context.getBeanDefinitionCount());
        String[] beans = context.getBeanDefinitionNames();
        for (String beanName : beans){
            System.out.println("Bean --> " + beanName);
        }
        System.out.println();

        ImpresoraService is = (ImpresoraService)context.getBean("impresoraService");
        is.imprimirDocumento();

        context.close();
    }
}
