# Exercício 10 do Capítulo 1


"Na lista de interfaces da estrutura de coleções do JAVA destacam-se os conjuntos, listas, filas e mapas"

1) **Conjunto** __(Set__ e __SortedSet)__
> é uma coleção de elementos que modela a abstração matemática para conjuntos. Não mantém indexação e nem contagem dos elementos pertencentes. Cada elemento pertence ou não pertence ao conjunto.


2. **List** e **ArrayList**
> o List é uma interface e o ArrayList é a classe que implementa.

___Criar lista___
~~~java
List<Professor> professores = new ArrayList<Professor>();
~~~

___Adiciona elemento___
~~~java
Professor professor = new Professor();
professores.add(professor);
~~~
___Contém Elemento___
~~~java
professores.Contains(professor);
~~~
___Remove elemento___
~~~java
   professores.remove(1); 
~~~

**Alunos**: ___Ewerton Santiago, Marcus Henrique, Wllynilson Carneiro___

### Referências: 
DEITEL, H.M. (2005) Java: Como Programar. São Paulo: Person Prentice Hall, 6ª edição. Capítulo 19: Coleções, páginas 673-714.
