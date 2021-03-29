# Java Threads
Ejemplos utilizando hilos en Java

## Formas de utilizar hilos en Java
Existen 2 formas principales para utilizar hilos en Java

##### Heredando de la clase Thread
``` 
public class MyThread extends Thread {

}
```
###### Algunos métodos de la clase Thread
 `currentThread()` Devuelve una referencia al objeto de subproceso que se está ejecutando actualmente 
 
 `sleep(long ms)` Hace que el subproceso que se está ejecutando entre en suspensión (cese temporalmente la ejecución) durante el número especificado de milisegundos.
 
 `yield()` Una sugerencia para el planificador de que el subproceso actual está dispuesto a ceder su uso actual de un procesador. Pausa el hilo en ejecución para permitir la ejecución de otros.
 
 Más métodos en la documentación de [Oracle](https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html)

##### Implementando la interfaz Runnable
``` 
public class MyRunnable implements Runnable {

}
```
Con la implementación de la interfaz Runnable debemos sobreescribir el método `run()`
```
@Override
public void run() {
	//el código a ejecutar en el hilo debe ir acá
}
```
###### Algunos métodos de la instancia de la clase 
`start()` Hace que este hilo comience a ejecutarse. Dos subprocesos se ejecutan simultáneamente. Nunca es legal iniciar un hilo más de una vez. 

`run()` Este método es llamado por `start()` después de que el hilo del sistema se haya inicializado.

`join()` Espera como máximo milisegundos para que este hilo muera. Al utilizar este método nos aseguramos que no se ejecute otro hilo hasta que éste finalice.

`setPriority()` Asigna la prioridad al hilo indicada por el valor pasado como parámetro.

`getPriority()` Devuelve la prioridad del hilo de ejecución en curso.

`setName()` Asigna un nombre para identificar a los hilos de una forma más cómoda.

`getName()` Devuelve el nombre asignado al hilo.

 Más métodos en la documentación de [Oracle](https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html)
