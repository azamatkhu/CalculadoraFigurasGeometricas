# Proyecto 1 - Calculadora de Figuras Geométricas 
_Autor: Azamat Khudaiberdiev (azamat1x)_

Una aplicación en Java por consola que permita al usuario calcular el área y el perímetro de diferentes figuras geométricas 
(círculo, rectángulo y triángulo). 

El programa esta estructurado utilizando los principios de la Programación Orientada a Objetos (POO) y esta aplicado los 
fundamentos de programación que he visto en clase.

## Como ejecutar?
1. Descargar los archivos directamente aquí o clonar el repositorio.
2. En cualquier aplicacion IDE (preferible IntelliJ) abrir el proyecto y asegurarse que las clases han importado y compilado bien.
3. Ejecutar el programa.

## Ejecución
Al iniciar, se presentará un menú interactivo:

```
---------- Introduce una una de las figuras posibles: 
1. Circulo
2. Rectangulo
3. Triangulo
0. Mostrar Resumen
---------- Elige una opcion ----------
```

Aquí, se puede elegir cualquier opcion, utilizando **SOLO** números.
Si has elegido opciones 1,2 o 3 te pedirá que introduzcas algunos datos (mira en la consola). 
Introduce los datos necesarios (que no sean invalidos) para que no aparezcan errores.

Despues, se mostrarán los resultados de todos los datos introducidos en la consola, incluyendo las áreas y perímetros calculados.
Por ejemplo:

```
(nombre_de_figura) se ha creado!
    ****     
  *      *   
 *        * 
 *        * 
  *      *   
    ****     
Su area es (numero_de_area) y perimetro es (numero_de_perimetro)
```
Si ha seleccionado la opción 4, el programa le mostrará el resumen general del programa.
Por ejemplo:

```
-------------- RESUMEN ---------------
Las figuras creadas: 
Circulo@37f8bb67
Circulo@49c2faae
Rectangulo@20ad9418
```

