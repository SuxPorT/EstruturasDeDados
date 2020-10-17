# Busca Binária
Implemente um método **RECURSIVO** de **busca binária**. A **busca binária** só pode ser realizada sobre um conjunto
de **dados** (*array*) previamente **ordenado**. Por exemplo, considere uma agenda telefônica onde os telefones estão
ordenados de acordo com os nomes dos respectivos proprietários. O objetivo da **busca binária** é encontrar um determinado
telefone dentro desse conjunto de elementos.

O princípio de uma **busca binária** é o seguinte:
1. Se há apenas um elemento no *array*, basta compará-lo com o elemento desejado
2. Caso contrário, compare com o elemento do meio do *array*
3. Se o elemento do meio é o elemento desejado, então o retorne à posição meio
	- 3.1 Caso contrário, verifique se o elemento do meio é maior que o elemento desejado
	- 3.2 Se o elemento é maior, então considere a metade inferior do *array* e repita o procedimento
	- 3.3 Caso contrário, considere a meteade superior do *array* e repita o procedimento

![diagram](https://user-images.githubusercontent.com/51892110/89742699-95a58100-da72-11ea-9eb9-01257c4f1f35.png)

É importante ressaltar que a cada comparação realizada o número de elementos a serem procurados é dividido pela metade.