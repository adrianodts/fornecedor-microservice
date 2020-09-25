# fornecedor-microservice

Serviço que lista os produtos do fornecedor e se registra como client no eureka server.


Exemplo de chamada:

```
curl -X GET \
  http://localhost:8081/info/SP \
  -H 'cache-control: no-cache' \
  -H 'postman-token: 1c66e165-8caa-55aa-b33a-a3b9a63a36eb'
```