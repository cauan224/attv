package com.example.primeiro_projeto.contraller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {

    @GetMapping
    public String mensagem() {
        return "Ola,mundo!";

    }@GetMapping("/aluno")
    public String aluno() {
        return "Ola,aluno!";

    }@GetMapping ("/dev")
    public String dev() {
        return "Ola,dev!";

    }
}
