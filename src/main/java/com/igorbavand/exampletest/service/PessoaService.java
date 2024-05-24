package com.igorbavand.exampletest.service;

import com.igorbavand.exampletest.model.Pessoa;
import com.igorbavand.exampletest.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }
}
