package edu.cibertec.lab05;

import edu.cibertec.lab05.beans.DocumentoExcel;
import edu.cibertec.lab05.beans.DocumentoTexto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("edu.cibertec.lab05")
public class AppConfig {

    @Bean(initMethod = "iniciar", destroyMethod = "destruir")
    //@Scope("singleton")
    //@Scope("prototype")
    //@Lazy
    //@DependsOn({"impresoraService"})
    public DocumentoExcel documentoExcel() {
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoTexto() {
        return new DocumentoTexto();
    }
}
