package com.example.aluia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servico {

    @Autowired
    private ClasseTeste classeTeste;

    @Autowired
    private Energia energia;

    @RequestMapping("/inicio")
    private void inicia() {
        // TODO Auto-generated method stub
        System.out.println("iniciou");

        if (this.classeTeste != null) {
            this.classeTeste.imprime();
        }

        if (this.energia != null) {
            System.out.println("quantidade = " + this.energia.getQuantidade());
        }
    }
}
