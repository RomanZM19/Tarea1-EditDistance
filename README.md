# Tarea1-EditDistance
El programa encuentra la distancia entre 2 dadas cadenas de símbolos, es decir, regresa el mínimo de operaciones requeridas
para trasnformar la primera palabra en la segunda.

Las operaciones permitidas son:
1) Sustituir
2) Insertar
3) Borrar

![edit](https://user-images.githubusercontent.com/98791779/185814362-d1c892dc-b426-47cd-bd61-9d9a0cdaa937.png)

Pruebas:
[LeetCode]
1) Input: palabra1 = "horse", palabra2 = "ros"
Output: 3
Explicación:
horse -> rorse (sustituir 'h' con 'r')
rorse -> rose (borrar 'r')
rose -> ros (borrar 'e')

2) Input: palabra1 = "intention", palabra2 = "execution"
Output: 5
Explicación
intention -> inention (borrar 't')
inention -> enention (sustituir 'i' con 'e')
enention -> exention (sustituir 'n' con 'x')
exention -> exection (sustituir 'n' con 'c')
exection -> execution (insertar 'u')

[Clase]
3) Input: palabra1 = "ernandof", palabra2 = "fernando"
Output: 2
Explicación
ernandof -> fernando (insertar 'f')
fernandof -> fernando (borrar 'f')
