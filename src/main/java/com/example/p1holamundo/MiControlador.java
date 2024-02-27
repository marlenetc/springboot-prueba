package com.example.p1holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {
    @GetMapping("/saludo")
    public String saludo(){
        return "¡Hola mundo!, soy Marlene";
    }
}
