package com.hellow.eventos.controller;

import com.hellow.eventos.classes.Cliente.Cliente;
import com.hellow.eventos.classes.Cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(name="/todos")
    public List<Cliente> getTodosCliente() { return clienteRepository.findAll();}

    @PostMapping(name = "/add")
    public Cliente addCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
        return cliente;

    }

}
