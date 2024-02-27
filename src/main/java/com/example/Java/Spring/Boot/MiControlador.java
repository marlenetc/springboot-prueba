package com.example.Java.Spring.Boot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiControlador {
    @GetMapping("/saludo")
    public String saludo(){
        return "¡Hola mundo!, soy Marlene";
    }
}
