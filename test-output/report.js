$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/BuscarProduto.feature");
formatter.feature({
  "name": "Inserir produto no carrinho",
  "description": "  Como um cliente da loja virtual\n  Quero comprar mais de um produto distinto realizando apenas um checkout\n  Para que não precise realizar o pagamento de cada produto individualmente",
  "keyword": "Funcionalidade"
});
formatter.background({
  "name": "Selecionando produto",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscarProdutoStep.que_estou_acessando_a_aplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito o nome do produto \"pendrive\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscarProdutoStep.digito_o_nome_do_produto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "teclo enter",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.teclo_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo página URL \"https://www.kabum.com.br/perifericos/pen-drive\"",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.visualizo_página_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no primeiro item",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.clico_no_primeiro_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Inserir apenas um produto no carrinho",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "clico no botao para ir para o carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.clico_no_botao_para_ir_para_o_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o carrinho contém um item",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscarProdutoStep.o_carrinho_contém_um_item()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Selecionando produto",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscarProdutoStep.que_estou_acessando_a_aplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digito o nome do produto \"pendrive\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscarProdutoStep.digito_o_nome_do_produto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "teclo enter",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.teclo_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo página URL \"https://www.kabum.com.br/perifericos/pen-drive\"",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.visualizo_página_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no primeiro item",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.clico_no_primeiro_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Inserir item da sugestão de compra no carrinho",
  "description": "",
  "keyword": "Cenário"
});
formatter.step({
  "name": "que estou no checkout",
  "keyword": "Dado "
});
formatter.match({
  "location": "BuscarProdutoStep.que_estou_no_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu clico pra comprar o item da sugestão",
  "keyword": "Quando "
});
formatter.match({
  "location": "BuscarProdutoStep.eu_clico_pra_comprar_o_item_da_sugestão()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botao para ir para o carrinho",
  "keyword": "E "
});
formatter.match({
  "location": "BuscarProdutoStep.clico_no_botao_para_ir_para_o_carrinho()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o carrinho contém dois itens",
  "keyword": "Então "
});
formatter.match({
  "location": "BuscarProdutoStep.o_carrinho_contém_dois_itens()"
});
formatter.result({
  "status": "passed"
});
});