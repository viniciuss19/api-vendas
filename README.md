# api-vendas
API de vendas feita para o processo seletivo da XBRAIN, o sistema utiliza Java e o banco local H2 para fazer requisições REST
----------------------------------------------------------------------------------------------------------------

Para testar a API, selecione seu aplicativo de testes favorito (POSTMAN, Insomnia, etc...)

Inicialmente a porta configurada é a localhost:8090

Abaixo estará listado como fazer os testes dos métodos exigidos e suas respectivas rotas:

Gerar Venda:
http:localhost:8090/sale (POST)

Passe um JSON pelo corpo da requisição, dessa maneira, por exemplo:
{

"amount":1000,

	"salesmanId":1,
  
	"salesmanName":"Vinicius"
  
}


