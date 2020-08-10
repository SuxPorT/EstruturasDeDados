# Lista Encadeada
## 01 - Implementação da Lista Encadeada
Implemente uma classe **Lista Encadeada** em Java, adotando a representação **DINÂMICA**. Uma **Lista** deve ter
**OBRIGATORIAMENTE** a seguinte representação:

![class](https://user-images.githubusercontent.com/51892110/89742516-0fd50600-da71-11ea-811c-c32125ec6f37.png)

As seguintes operações devem ser implementadas:
- a) **vazia()**: verifica se a **Lista** está vazia
- b) **inserePrimeiro(int info)**: insere o elemento **info** como primeiro na **Lista**
- c) **insereDepois(Node node, int info)**: insere o elemento **info** depois do nó **Node**
- d) **insereUltimo(int info)**: insere o elemento **info** como último na **Lista**
- e) **insereOrdenado(int info)**: insere o elemento **info** de maneira ordenada na **Lista**
- f) **imprime()**: imprime todos os elementos da **Lista**
- g) **removePrimeiro()**: remove o primeiro elemento da **Lista** e retorna o **Node** removido
- h) **removeUltimo()**: remove o último elemento da **Lista** e retorna o **Node** removido
- i) **remove(Node no)**: remove o **Node** da **Lista** e retorna o **Node** removido

**Observação**: É expressamente proibido a utilização de estruturas de dados prontas disponibilizadas pela API do Java
ou afins. Exemplo: **List**, **ArrayList**, **Vector**, etc.

## 02 - Implementação da Fila e Lista
Utilize a implementação de **Lista Encadeada** para criar duas classes: **Pilha** e **Fila** que manipularão valores
inteiros.

A classe **Pilha** a ser implementada com o auxílio da classe **ListaEncadeada** deve apresentar pelo menos os
seguintes métodos:
- ***void empilha(int dado)***: empilha o elemento **dado**
- ***int desempilha()***: retorna e retira o elemento do topo da **Pilha** (retorna um valor inválido caso a **Pilha**
esteja vazia)
- ***int topo()***: retorna o elemento do topo da **Pilha** (não modifica a **Pilha**)
- ***void mostra_pilha()***: mostra todos os elementos armazenados na **Pilha**

A classe **Fila** a ser implementada com o auxílio da classe **ListaEncadeada** deve apresentar pelo menos os seguintes
métodos:
- ***void insere(int dado)***: insere o elemento **dado** na **Fila**
- ***int remove()***: retorna e reove um elemento da **Fila**
- ***void mostra_fila()***: mostra todos os elementos da **Fila**

**Observações**:
- Não utilize estruturas extra de armazenamento como **arrays**. A única representação a ser utilizada para armazenamento
é a representação dinâmica de **Lista Encadeada** implementada na etapa 01.
- Você deve utilizar os métodos adequados da classe **Lista** para implementar os métodos das duas classes a serem
criadas.
- Você pode implementar métodos auxiliares como ***"vazia()"*** em ambas as classes **Pilha** e **Fila** utilizando
procedimentos da classe **Lista**.