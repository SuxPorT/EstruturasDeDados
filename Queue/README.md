# Fila
## 01 - Implementação de Fila Circular
Implemente uma classe **Fila** em Java, adotando a representação **CIRCULAR**. Uma **Fila** deve ter
**OBRIGATORIAMENTE** a seguinte representação:

![class](https://user-images.githubusercontent.com/51892110/89742034-afdc6080-da6c-11ea-8d9c-47a426328d83.png)

As seguintes operações devem ser implementadas:
- a) ***cheia()***: verifica se a **Fila** está cheia
- b) ***vazia()***: verifica se a **Fila** está vazia
- c) ***insere(E)***: insere o elemento **E** na **Fila**
- d) ***remove()***: remove um elemento da **Fila**
- e) ***imprime()***: imprime todos os elementos da **Fila**, do primeiro ao último
- f) ***inicializa(n)***: cria a **Fila** com capacidade para **n** elementos

**Observação**: É expressamente proibido a utilização de estruturas de dados prontas disponibilizadas pela API do
Java ou afins. Exemplo: ***List***, ***ArrayList***, ***Vector***, etc.

## 02 - Merge
A operação de **MERGE** consiste em obter todos os elementos de **dois conjuntos** ordenados formando um **terceiro
conjunto** também ordenado conforme a figura abaixo.

![diagram](https://user-images.githubusercontent.com/51892110/89742035-b10d8d80-da6c-11ea-97b6-2d22ff5f4eae.png)

Crie uma classe chamada **Merge** e implemente uma função que recebe duas filas **A** e **B** como entrada e gera uma
terceira fila **R** com o resultado utilizando as operações de **Fila** definidas anteriormente. Considere que as filas
de entrada **A** e **B** sempre estarão ordenadas.