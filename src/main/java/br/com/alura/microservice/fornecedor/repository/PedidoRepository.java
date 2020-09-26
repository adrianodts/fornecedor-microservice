package br.com.alura.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.microservice.fornecedor.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
