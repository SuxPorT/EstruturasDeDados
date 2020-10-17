# Tabela Hash
Implemente uma classe **Tabela Hash** em Java, adotando o conceito de **encademaneto de lista**. Uma **Lista** deve ter
**OBRIGATORIAMENTE** a seguinte representação:

![class](https://user-images.githubusercontent.com/51892110/89814440-8299bc00-db19-11ea-8e1a-f67ddd701bbb.png)

As seguintes operações devem ser implementadas:
- a) Implemente uma classe **NodeTabela**. Essa classe conterá dois atributos: **informação** e **lista**, sendo que a
**lista** é uma referência para um **objeto** da classe **ListaEncadeada**
- b) Crie uma classe chamada **TabelaHash**. Essa classe conterá apenas dois atributos: **colisão** (número de colisões
na tabela) e **tabela** (um *array* de **objetos** da classe **NodeTabela**)
- c) Faça a leitura do teclado para o tamanho da tabela
- d) Implemente um método ***void insere(int chave)*** que insere a chave **chave** na tabela
    - a. A função *hash* implementada deve ser a função *hash* padrão ***"chave % tam"***
    - b. Caso haja colisão na inserção de um elemento, o atributo **colisão** deve ser incrementado
- e) Crie um **construtor** para a classe **TabelaHash** passando como parâmetro o tamanho da tabela. No **construtor**
você deve:
    - a. Instanciar um *array* (atributo **tabela**) com o tamanho passado como parâmetro
    - b. Inicializar o número de colisões com 0
    - c. Chamar um método para preencher o *array* **tabela** com **objetos** do tipo **NodeTabela** que armazena o
    valor ***"-1"*** (essa situação representa uma tabela vazia)
    - d. Chamar um método para preencher a tabela com inteiros cujos valores variam de **0** a **1000000** (**um
    milhão**). O número de elementos inseridos representará **90%** do tamanho total da tabela. Cada inserção deverá
    ser feita com a chamada do método ***insere*** citado no item **d)**
 - f) Implemente um método que mostre todos os elementos da **Tabela Hash**. A disposição dos elementos deve ser a
 seguinte:
 
 ![diagram](https://user-images.githubusercontent.com/51892110/89815261-dc4eb600-db1a-11ea-8e9f-cf39b8c8d89a.png)
 
 - g) Implemente um método ***boolean busca(int chave)*** que retorna ***true*** caso a chave exista na tabela e
 ***false*** caso o elemento não exista na tabela
 - h) Na sua função ***main***, implemente um procedimento que leia uma chave do usuário e mostre uma mensagem
 específica caso o elemento exista ou não na tabela. Este procedimento deve ser repetido até que o usuário entre com o
 valor ***"-1"***