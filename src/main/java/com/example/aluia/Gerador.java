package com.example.aluia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Gerador {
    @Bean
    public Energia energia() {
        Energia energia = new Energia();

        energia.setQuantidade(10);
        return energia;
    }
}
