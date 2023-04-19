Encapsulamento:

Classe Produto no pacote model: esta classe encapsula as propriedades de um produto (nome, preço, estoque) e seus métodos relacionados. Os dados são protegidos por meio de modificadores de acesso privado e são acessados apenas por meio de métodos públicos, como getPreco(). Isso permite que o estado interno do objeto seja protegido e alterado de maneira controlada, garantindo a integridade dos dados.

Herança:

Classe Pessoa no pacote model: esta classe é a classe base para Usuario. A classe Usuario herda as propriedades e métodos da classe Pessoa. Isso evita duplicação de código e torna o código mais modular. Além disso, a herança permite que a classe Pessoa seja usada como um tipo genérico para se referir a ambos os tipos de objetos.

Polimorfismo:

Na classe FormaPagamento no pacote enums, os diferentes tipos de pagamentos (PIX, CARTÃO e DINHEIRO) servem para aplicar os descontos no método calcularValorTotal(). Esse método conta com uma lógica que permite aplicar os diferentes tipos de descontos e acréscimo. Isso permite que diferentes tipos de pagamentos sejam tratados uniformemente quando é necessário.

Abstração:

Classe Pedido no pacote model: esta classe abstrai as propriedades de um pedido e encapsula a lógica relacionada. Ela modela apenas as propriedades e comportamentos mais relevantes de um pedido (como a lista de produtos e o valor total), ignorando detalhes irrelevantes. Isso ajuda a simplificar o design do sistema e a torná-lo mais fácil de entender e manter.