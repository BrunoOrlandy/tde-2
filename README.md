Requisitos do programa

Construtores em todas as classes (exceto de interface de usuário)
Uma hierarquia para representar carros com classe abstrata
Use uma estrutura de dados única para guardar todos os carros
Uso de pacotes
Documentação com javadoc das classes e dos principais métodos
Descrição do problema

Você trabalha em uma empresa de informática que foi contratada para informatizar uma locadora de automóveis.

Automóveis são representados com os seguintes atributos:

placa
capacidade de pessoas
ano do carro
valor base da diária de locação
Nessa locadora os automóveis são classificados como populares, médios e grandes (use uma classe específica para  representar cada tipo de automóvel) e o valor da diária é determinado da seguinte forma:

para carros populares somente o valor base da diária
para carros médios, o valor base que é reduzido em 2% para cada ano de idade do modelo, limitado a um desconto de 10%
para carros grandes, o valor base é relativo a carros com capacidade para 5 pessoas. Para cada pessoa a mais na capacidade há um acréscimo de 5%, limitado a 20%   
A locadora precisa organizar informações sobre:

Automóveis disponíveis
Processo de locação/devolução
O sistema para a locadora precisa fornecer uma interface de usuário simples incluindo as seguintes Funcionalidade.

Cadastrar Automóvel
Pesquisar automóveis disponíveis informando valor máximo pretendido para a diária, e efetuar uma locação
o sistema mostra uma lista dos automóveis disponíveis considerando o valor máximo informado
o usuário seleciona um deles
o usuário informa o número de dias de locação e a data atual
Devolver um automóvel informando a data da devolução
O sistema deve informar o valor a ser pago. Para devoluções em atraso, inclui uma multa de 20% nos dias extras
