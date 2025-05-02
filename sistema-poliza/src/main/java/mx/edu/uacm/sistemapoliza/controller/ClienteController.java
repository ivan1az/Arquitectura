package mx.edu.uacm.sistemapoliza.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde el controlador de clientes";
    }
}
