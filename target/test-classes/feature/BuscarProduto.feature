#language: pt
Funcionalidade: Inserir produto no carrinho

  Como um cliente da loja virtual
  Quero comprar mais de um produto distinto realizando apenas um checkout
  Para que não precise realizar o pagamento de cada produto individualmente

  Contexto: Selecionando produto
    Dado que estou acessando a aplicação
    Quando digito o nome do produto "pendrive"
    E teclo enter
    E visualizo página URL "https://www.kabum.com.br/perifericos/pen-drive"
    E clico no primeiro item

  Cenário: Inserir apenas um produto no carrinho
    E clico no botao para ir para o carrinho
    Então o carrinho contém um item

  Cenário: Inserir item da sugestão de compra no carrinho
    Dado que estou no checkout
    Quando eu clico pra comprar o item da sugestão
    E clico no botao para ir para o carrinho
    Então o carrinho contém dois itens