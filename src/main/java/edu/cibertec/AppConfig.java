package edu.cibertec;

import edu.cibertec.beans.DocumentoExcel;
import edu.cibertec.beans.DocumentoTexto;
import edu.cibertec.service.ImpresoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DocumentoExcel documentoExcel() {
        return new DocumentoExcel();
    }

    @Bean
    public DocumentoTexto documentoT() {
        return new DocumentoTexto();
    }

    @Bean
    public ImpresoraService impresoraXYZ() {
        return new ImpresoraService();
    }
}
