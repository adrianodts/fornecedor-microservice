# fornecedor-microservice

Serviço que lista os produtos do fornecedor e se registra como client no eureka server.


Exemplo de chamada Info por estado:

```
curl -X GET \
  http://localhost:8081/info/SP \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 1c66e165-8caa-55aa-b33a-a3b9a63a36eb'
```


Exemplo de chamada pedido

```
curl -X POST \
  http://localhost:8081/pedido \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: d43bdb63-3f11-10df-badf-d454959316f4' \
  -d '[
			{
				"id" : 1,
				"quantidade" : 1
			},
			{
				"id" : 2,
				"quantidade" : 2
			}
		]'
```