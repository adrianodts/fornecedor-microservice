package br.com.alura.microservice.fornecedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FornecedorMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FornecedorMicroserviceApplication.class, args);
	}

}
