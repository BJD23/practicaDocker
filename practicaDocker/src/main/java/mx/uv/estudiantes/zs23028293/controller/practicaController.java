package mx.uv.estudiantes.zs23028293.controller;

import mx.uv.estudiantes.zs23028293.entity.saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practicaController {

    @GetMapping("/saludo")
    public String mensaje() {
        return new saludo().getMensaje();

    }
}
