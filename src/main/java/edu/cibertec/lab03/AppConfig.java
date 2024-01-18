package edu.cibertec.lab03;

import edu.cibertec.lab03.beans.DocumentoExcel;
import edu.cibertec.lab03.beans.DocumentoTexto;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("edu.cibertec.lab03")
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
