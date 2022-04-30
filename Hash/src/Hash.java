public class Hash {
    //Nombre: Bruno Javier Paris
    //Legajo: VINF012105
    //DNI: 37659313
    //Nombre: Carlos Tomás Núñez
    //Legajo: VINF012142
    //DNI: 42588090
    //Nombre: Carlos Andres Castaño
    //Legajo: VINF012100
    //DNI: 30101548

    int dato;
    int estado; //0 = Vacio, 1 = Eliminado, 2 = Ocupado

    static int FuncionHash(int n, int m) {

        return n % m; // la operación % devolverá el resto de la division de ambos números, por lo que siempre estará dentro del tamaño m.
    }

    static void insertaHash(Hash[] h, int m, int n) {
        boolean i = false;
        int j = FuncionHash(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].dato = n;
                h[j].estado = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            System.out.print("Elemento insertado con Éxito! \n");
        } else {
            System.out.print("Tabla llena!!! \\n");
        }
    }

    static int buscaHash(Hash[] h, int m, int n) {

        int hash = FuncionHash(n, m);
        int valor = 0;
        boolean i = false;
        while (hash < m && !i) {//busca desde el valor buscado por n hasta el ultimo valor de la tabla
            if (h[hash].estado == 2 && h[hash].dato == n) {
                valor = hash;//si el estado es "Ocupado" y el dato es el valor buscado, guardo el numero en la variable a devolver.
                i = true;//y salgo del loop
            } else {
                valor = -1;// si no encuentro el valor, guardo -1 en la variable a devolver.
                hash++;// y busco en la posicion siguiente.
            }
        }
        return valor; //devuelvo el valor encontrado o "-1" si no se encuentra nada.
    }

    static int eliminaHash(Hash[] h, int m, int n) {
        int i = buscaHash(h, m, n);
        if (i == -1) {
            return -1;
        } else {
            h[i].estado = 1;
            System.out.print("Elemento Borrado! \n");
            return 1;
        }
    }
}


