package com.igorbavand.exampletest.controller;

import com.igorbavand.exampletest.model.Pessoa;
import com.igorbavand.exampletest.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa) {
        return service.salvar(pessoa);
    }

}
