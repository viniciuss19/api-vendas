# api-vendas xbrain
API de vendas feita para o processo seletivo da XBRAIN, o sistema utiliza Java e o banco local H2 para fazer requisições REST
----------------------------------------------------------------------------------------------------------------

Para testar a API, selecione seu aplicativo de testes favorito (POSTMAN, Insomnia, etc...)
Inicialmente a porta configurada é a localhost:8090
---------------------------------------------------------------
Abaixo estará listado como fazer os testes dos métodos exigidos e suas respectivas rotas:

Gerar Venda:
http://localhost:8090/sale (POST)

Passe um JSON pelo corpo da requisição, dessa maneira, por exemplo:
{ 

	"amount": 1500,
	"salesmanId: 1,
	"salesmanName: "Vinicius"
  
}
-------------------------------------------------------

 Retornar a lista de vendedores com os campos: nome, total de vendas do vendedor e média de vendas diária, conforme o período informado por parâmetro:
 
http://localhost:8090/salesman?startDate=&endDate=   (GET)

Para o funcionamento do método, basta inserir a data de início e data final do intervalo no parâmetro, no formato (YYYY-MM-DD), por exemplo:

http://localhost:8090/salesman?startDate=2023-05-11&endDate=2023-05-17
