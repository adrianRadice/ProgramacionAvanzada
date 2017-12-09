# Trabajo Práctico Opcional #1: TDD

Los trabajos prácticos opcionales otorgan medallas en Loom. Para acceder a ella, se deberá entregar el **fork de este proyecto (correctamente resuelto) antes de la fecha indicada**.

## Consigna

Deberá demostrar y evidenciar el uso de Test-driven Development. El trabajo se realizará de a dos integrantes, debiendo editar el archivo humans.rm correctamente.

### Problema a resolver

Escribir clases para transferir una suma determinada de una cuenta bancaria a otra. Se deberán considerar casos especiales, como saldo insuficiente, entre otros de su ocurrencia. Se espera poder utilizar sentencias similares a esta:

```
  cuentaOrigen.transferirMontoHacia(monto, cuentaDestino);
```

### Metodología

* Realicen un commit por cada etapa de TDD. Es decir, un commit para la etapa roja, uno para la etapa verde, y uno para la etapa azul (si fuera necesario). Y así, sucesivamente. Ejemplo (tomado de un caso aleatorio, no utilizar como guía de pasos para esta consigna):

<pre>
* 1573ab3 (HEAD -> master, origin/master) AZUL: Se abstrae solución para n <= 3
* 9fc1c62 VERDE: Se resuelve para n = 3
* a94981f ROJO: Se agrega el caso para n = 3
* f96fd6d AZUL: Se mejora nombre de variables
* 1c629fc VERDE: Se resuelve para n = 2
* 981fa94 ROJO: Se agrega el caso para n = 2
* a953c7c VERDE: Se resuelve caso base
* 2401573 ROJO: Primera prueba, se define clase y caso base, n = 1
</pre>

## Entrega

El repositorio se tomará automáticamente de Github el día sábado 9 de septiembre, a las 8:00 (AM)

### Aclaración
La entrega no implica el otorgamiento de la medalla. Se comprobará la correcta resolución del ejercicio. Pasada la fecha indicada, cualquier entrega no será considerada más que a modo anecdótico.
