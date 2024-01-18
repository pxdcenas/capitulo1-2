package edu.cibertec.lab01;

import edu.cibertec.lab01.beans.DocumentoExcel;
import edu.cibertec.lab01.beans.DocumentoTexto;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("edu.cibertec")
public class AppConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public DocumentoExcel documentoExcel() {
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoT() {
        return new DocumentoTexto();
    }

//    @Bean
//    public ImpresoraService impresoraXYZ() {
//        return new ImpresoraService();
//    }
}
