package com.uninter.demo.controller;

import com.uninter.demo.model.Cliente;
import com.uninter.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController //Define que esta classe responde a requisições HTTP
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired //Liga o Controller ao Repository
    private ClienteRepository repository;

    @PostMapping //CRIA um novo registro
    //O @RequestBody pega o JSON que veio do Postman e transforma em um objeto Java
    public Cliente criar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @GetMapping //LISTA todos os registros
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}") //Busca um registro específico
    //O @PathVariable pega o numero digitado na URL (tipo: /clientes/1) e joga na variável id
    public Cliente buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}