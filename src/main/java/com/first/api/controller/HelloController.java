package com.first.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String saludar() {
        return "Hola a todos, está Api realiza operaciones matemáticas";
    }

    @GetMapping("/suma")
    public String sumar() {
        return String.format("La suma de %s + %s es: %s ", 2, 3, 2 + 3);
    }

    @GetMapping("/resta")
    public String restar() {
        return String.format("La resta de %s - %s es: %s ", 2, 3, 2 - 3);
    }

    @GetMapping("/multiplicacion")
    public String multiplicar() {
        return String.format("La multiplicación de %s * %s es: %s ", 2, 3, 2 * 3);
    }

    @GetMapping("/division")
    public String dividir() {
        return String.format("La división de %s / %s es: %s ", 10, 2, 10 / 2);
    }

    @GetMapping("/calcular")
    public String mayor() {
        int n1 = 100;
        int n2 = 20;
        String message = "Los numero" + n1 + " y " + n2 + " son iguales";

        if (n1 > n2) {
            message = "El numero " + n1 + " es mayor que " + n2;
        }

        if (n2 > n1) {
            message = "El numero " + n2 + " es mayor que " + n1;
        }

        return message;

    }
}
