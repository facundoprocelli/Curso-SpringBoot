package com.CursoSpringBoot.PruebaSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Estoy diciendo que esto va a porcesar solicitudes HTTP
//@Controller esto sirve para el holaMundo que me renderiza el codigo 
public class HolaMunodController {

    @GetMapping("/hola")  // cada uno de estos metodos es un endpoint
    public String HolaMundo() {
        return "Hola mundo desde SpringBoot!";
    }

    @GetMapping("/holaMundo") // si yo pongo /holaMundo me va a ejecutar lo que este dentro de este metodo
    public String holaMundo(Model model) {
        model.addAttribute("nombre", "UTN");
        return "hola";
    }

}
