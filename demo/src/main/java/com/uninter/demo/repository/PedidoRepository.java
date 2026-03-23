package com.uninter.demo.repository;

import com.uninter.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface que herda o JpaRepository, (nos da métodos prontos como:save,findAll e deleteById)
public interface PedidoRepository extends JpaRepository<Pedido, Long> {}

