package br.com.docodigoaocontrato.taskforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SobreController {

    @GetMapping("/sobre")
    public String sobreMim() {
        return "Steffany - aprendendo Java e Spring no Do Código ao Contrato";
    }
}