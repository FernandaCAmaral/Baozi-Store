package com.uninter.demo.controller;

import com.uninter.demo.model.Pedido;
import com.uninter.demo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController //Define que esta classe responde a requisições HTTP
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired //Liga o Controller ao Repository
    private PedidoRepository repository;

    @PostMapping //CRIA um novo registro
    //O @RequestBody pega o JSON que veio do Postman e transforma em um objeto Java
    public Pedido criar(@RequestBody Pedido pedido) {
        return repository.save(pedido);
    }

    @GetMapping //LISTA todos os registros
    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}