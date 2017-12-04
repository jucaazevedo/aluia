package com.example.aluia;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class ClasseTeste {
    private static Logger LOGGER = Logger.getLogger(ClasseTeste.class);

    public void imprime() {
        LOGGER.info("imprime()");
        System.out.println("imprime2");
    }

}
