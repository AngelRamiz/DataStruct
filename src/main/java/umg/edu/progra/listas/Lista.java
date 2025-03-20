package umg.edu.progra.listas;

public class Lista {
    private Nodo primero;

    public Lista() {
        primero = null;
    }

    public void insertarCabezaLista(int entrada) {
        Nodo nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
    }

    public void visualizar() {
        Nodo n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
        System.out.println();
    }

    // 🔹 Ejercicio 1: Ordenar la lista de forma ascendente
    public void ordenarLista() {
        if (primero == null || primero.enlace == null) return;

        boolean swapped;
        do {
            swapped = false;
            Nodo actual = primero;
            Nodo anterior = null;

            while (actual.enlace != null) {
                if (actual.dato > actual.enlace.dato) {
                    int temp = actual.dato;
                    actual.dato = actual.enlace.dato;
                    actual.enlace.dato = temp;
                    swapped = true;
                }
                anterior = actual;
                actual = actual.enlace;
            }
        } while (swapped);
    }

    // 🔹 Ejercicio 2: Unir dos listas enlazadas
    public void unirLista(Lista otraLista) {
        if (primero == null) {
            primero = otraLista.primero;
            return;
        }
        Nodo temp = primero;
        while (temp.enlace != null) {
            temp = temp.enlace;
        }
        temp.enlace = otraLista.primero;
    }

    // 🔹 Ejercicio 3: Separar numeros pares e impares en dos listas
    public void separarParesImpares(Lista pares, Lista impares) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.dato % 2 == 0) {
                pares.insertarCabezaLista(actual.dato);
            } else {
                impares.insertarCabezaLista(actual.dato);
            }
            actual = actual.enlace;
        }
    }

    // 🔹 Metodo 4: Invertir la lista enlazada
    public void invertirLista() {
        Nodo prev = null;
        Nodo actual = primero;
        Nodo siguiente;
        
        while (actual != null) {
            siguiente = actual.enlace;
            actual.enlace = prev;
            prev = actual;
            actual = siguiente;
        }
        primero = prev;
    }

    // 🔹 Metodo 5: Obtener el elemento en la posición n desde el final
    public int obtenerDesdeFinal(int n) {
        int tamaño = obtenerTamano();
        if (n > tamaño) return -1; // No existe esa posición

        Nodo actual = primero;
        for (int i = 0; i < tamaño - n; i++) {
            actual = actual.enlace;
        }
        return actual.dato;
    }

    // 🔹 Metodo 6: Eliminar duplicados en la lista enlazada
    public void eliminarDuplicados() {
        Nodo actual = primero;
        while (actual != null) {
            Nodo temp = actual;
            while (temp.enlace != null) {
                if (actual.dato == temp.enlace.dato) {
                    temp.enlace = temp.enlace.enlace;
                } else {
                    temp = temp.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    // 🔹 Metodo 7: Obtener el tamaño de la lista enlazada
    public int obtenerTamano() {
        int contador = 0;
        Nodo actual = primero;
        while (actual != null) {
            contador++;
            actual = actual.enlace;
        }
        return contador;
    }
}
