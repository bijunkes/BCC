# Perguntas

1. **static em proximoNumero e não em numero:** o contador é único e compartilhado por todos os pedidos (pertence à classe), pois precisa lembrar quantos já foram criados. O número é uma característica de cada pedido, então cada objeto guarda o seu valor.


2. **final x abstract:** calcularPreco é abstract porque cada subclasse tem uma regra própria e a superclasse não sabe calcular ela. calcularPrecoComDesconto é final porque a regra do desconto deve ser igual para todos e nenhuma subclasse pode alterar ela; ela só reaproveita calcularPreco via polimorfismo. Um mesmo método não pode ser as duas coisas, is abstract exige que a subclasse sobrescreva, final proíbe sobrescrever (o compilador rejeita).


3. **Navegação bidirecional:** Cliente ganharia um atributo List<Pedido> pedidos, com método para adicionar/consultar pedidos, e seria preciso manter os dois lados consistentes (ao criar um Pedido, registrá-lo também no Cliente). Isso aumenta o acoplamento.


4. **throws:** SaldoInsuficienteException estende Exception, é verificada, e o compilador obriga quem chama a tratar ou declarar throws. adicionarItem lança IllegalArgumentException/IllegalStateException, que são RuntimeException (não verificadas), então não exigem declaração nem tratamento obrigatório.
