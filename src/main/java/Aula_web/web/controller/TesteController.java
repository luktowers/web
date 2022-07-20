package Aula_web.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Aula_web.web.TesteRepository.TesteRepository;
import Aula_web.web.model.Teste;

@RestController
@RequestMapping(value = "teste")
public class TesteController {

    @Autowired
    private TesteRepository repository;

    @GetMapping
    public String getTeste (@RequestParam String nome, Integer idade, Double altura){

        return nome + " , " + idade + " , " + altura;
    }
    
    @GetMapping(path = "{id}")
    public Teste getTestePath (@PathVariable Long id){

        Teste teste = repository.findById(id).get();

        return teste;
    }

    @PostMapping
    public Teste salvar (@RequestBody Teste teste){
        Teste result = repository.save(teste);
        return result;
    }
}
