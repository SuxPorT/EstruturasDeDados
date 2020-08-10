# Pilha
## 01 – Implementação de Pilha
Implemente uma classe **Pilha** em Java. Uma **Pilha** deve ter **OBRIGATORIAMENTE** a seguinte representação:

![class](https://user-images.githubusercontent.com/51892110/89738275-b27b8d80-da4d-11ea-8853-604f1ded5626.png)

As seguintes operações devem ser implementadas:
- a) ***topo()***: retorna o elemento no topo da **Pilha**
- b) ***vazia()***: retorna ***true*** se a **Pilha** está vazia e ***false*** caso contrário
- c) ***cheia()***: retorna ***true*** se a **Pilha** está cheia e ***false*** caso contrário
- d) ***empilha(int elemento)***: coloca o *elemento* na **Pilha**
- e) ***desempilha()***: retira e retorna o *elemento* do topo da **Pilha**
- f) ***cria_pilha(int n)***: cria uma pilha capaz de armazenar até **n** elementos

**Observação**: É expressamente proibido a utilização de estruturas de dados prontas disponibilizadas pela API do
Java ou afins. Exemplo: ***List***, ***ArrayList***, ***Vector***, etc.


## 02 - Validador de Expressões
Um exemplo de utilização de pilha consiste em avaliar uma expressão aritmética segundo a utilização dos parênteses
**“()”**, colchetes **“[]”** e chaves **“{}”**. O problema consiste em criar uma pilha de caracteres. O programa recebe
uma sequência de caracteres que representa uma expressão aritmética  genérica, por exemplo: **{A\*(A+B)}**. A expressão
é lida caracter a caracter da esquerda para direita. Quando um caracter de abertura é encontrado **“(”**, **“\[”**, ou
**“{”**, esse caracter é empilhado. Quando um caracter de fechamento é encontrado **“)”**, **“]”** ou **“}”**, o
elemento do topo da pilha é comparado. Se o elemento do topo da pilha representa a abertura do respectivo fechamento,
então o elemento é desempilhado. Quando o final da expressão é obtido, se a pilha está vazia, então  a  expressão está
correta, caso contrário a expressão está incorreta.

![diagram](https://user-images.githubusercontent.com/51892110/89738328-02f2eb00-da4e-11ea-8b82-2233970f691d.png)

Crie uma classe chamada **Expressao** e implemente uma função que recebe uma *String* como entrada e verifica se os
delimitadores **“()”**, **“{}”** e **“[]”** são utilizados corretamente utilizando a **Pilha** desenvolvida
anteriormente. A função deve retornar ***true*** se a expressão é válida e ***false*** caso contrário.

**Exemplo**:

![diagram](https://user-images.githubusercontent.com/51892110/89738348-2322aa00-da4e-11ea-939e-abcae25128a8.png)

**Observação**: Modifique a estrutura de **Pilha** da questão anterior para armazenar caracteres (caso necessário).