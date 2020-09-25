package br.com.alura.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.entity.InfoFornecedor;
import br.com.alura.microservice.fornecedor.service.InfoService;

@RestController
@RequestMapping("/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@GetMapping("/{estado}")
	public ResponseEntity<InfoFornecedor> getInfoPorEstado(@PathVariable String estado) {
		return new ResponseEntity<InfoFornecedor>(infoService.getInfoPorEstado(estado), HttpStatus.OK);
	}
}
