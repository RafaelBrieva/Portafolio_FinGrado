package com.Portafolio.Portafolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PortafolioApplication {

    // Este método estará accesible en la ruta "/"
    @RequestMapping(value = "/inicio")
    public String index() {
        return "<h1>Bienvenidos !</h1>";
    }
    
    // Este método estará accesible en la ruta "/menu"
    @RequestMapping(value = "/menu")
    public String menu() {
        return "<h1>Menu Principal</h1>";
    }
    
    // Este método estará accesible en la ruta "/fin"
    @RequestMapping(value = "/fin")
    public String fin() {
        return "<h1>Fin Aplicación</h1>";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(PortafolioApplication.class, args);
    }
}
