package umg.edu.progra.listas;

import umg.edu.progra.listas.doblementeEnlazada.DoblementeEnlazada;

public class Principal {

    public static void main(String[] args) {

        // Crear una lista y agregar elementos
        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        // Mostrar la lista original
        System.out.println("Lista original:");
        lista.visualizar();
        
        // Ordenar la lista y mostrarla
        lista.ordenarLista();
        System.out.println("\nLista ordenada:");
        lista.visualizar();

        // Crear otra lista y unirla con la primera
        Lista otraLista = new Lista();
        otraLista.insertarCabezaLista(10);
        otraLista.insertarCabezaLista(20);
        otraLista.insertarCabezaLista(30);
        lista.unirLista(otraLista);
        System.out.println("\nLista despues de unir:");
        lista.visualizar();

        // Separar la lista en pares e impares
        Lista pares = new Lista();
        Lista impares = new Lista();
        lista.separarParesImpares(pares, impares);
        System.out.println("\nLista de numeros pares:");
        pares.visualizar();
        System.out.println("\nLista de numeros impares:");
        impares.visualizar();

        // Invertir la lista y mostrarla
        System.out.println("\nLista invertida:");
        lista.invertirLista();
        lista.visualizar();

        // Obtener un elemento desde el final
        int n = 2;
        System.out.println("\nElemento en la posicion " + n + " desde el final: " + lista.obtenerDesdeFinal(n));

        // Eliminar duplicados y mostrar la lista
        lista.eliminarDuplicados();
        System.out.println("\nLista sin duplicados:");
        lista.visualizar();

        // Mostrar el tamaño de la lista
        System.out.println("\nTamano de la lista: " + lista.obtenerTamano());
        
        //TAREA LISTA DOBLEMENTE ENLAZADA
    
        System.out.println("\n\n--- LISTA DOBLEMENTE ENLAZADA ---");
        DoblementeEnlazada listaDoble = new DoblementeEnlazada();

        // Insertar elementos al final
        listaDoble.insertAtEnd(10);
        listaDoble.insertAtEnd(20);
        listaDoble.insertAtEnd(30);
        listaDoble.insertAtEnd(40);

        System.out.println("\nLista despues de insertar al final:");
        listaDoble.displayForward();

        // Insertar elementos al inicio
        listaDoble.insertAtBeginning(5);
        listaDoble.insertAtBeginning(1);

        System.out.println("\nLista despues de insertar al inicio:");
        listaDoble.displayForward();

        // Contar nodos
        System.out.println("\nNumero de nodos en la lista: " + listaDoble.count());

        // Insertar despues de un valor especifico
        listaDoble.insertAfter(20, 25);
        System.out.println("\nLista despues de insertar 25 despues de 20:");
        listaDoble.displayForward();

        // Buscar un valor en la lista
        System.out.println("\n¿Existe el valor 25 en la lista? " + listaDoble.search(25));
        System.out.println("¿Existe el valor 50 en la lista? " + listaDoble.search(50));

        // Eliminar un valor
        listaDoble.delete(10);
        System.out.println("\nLista despues de eliminar 10:");
        listaDoble.displayForward();

        // Mostrar la lista en orden inverso
        System.out.println("\nLista en orden inverso:");
        listaDoble.displayBackward();

        // Invertir la lista
        listaDoble.reverse();
        System.out.println("\nLista despues de invertir:");
        listaDoble.displayForward();

        // Contar nodos despues de todas las operaciones
        System.out.println("\nNumero de nodos en la lista despues de todas las operaciones: " + listaDoble.count());
    }

    }
	