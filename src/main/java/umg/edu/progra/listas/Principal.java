package umg.edu.progra.listas;

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
    }
}