package org.example.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/noticia/{idDaNoticia}")
    public String test(@PathVariable String idDaNoticia){
        return "Hello! " + idDaNoticia;
    }

}
