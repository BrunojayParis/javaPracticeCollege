public class Principal {
    public static void main(String[] args) {
        int i, n, elemento;
// Tabla Definida de 15
        int m = 15;
        Hash[] h = new Hash[m];
        for (i = 0; i < m; i++) {
            h[i] = new Hash();
            h[i].estado = 0;
        }
// Insertar elemento
        Hash.insertaHash(h, m, 15);
        Hash.insertaHash(h, m, 130);
        Hash.insertaHash(h, m, 7);
        Hash.insertaHash(h, m, 32);
        Hash.insertaHash(h, m, 847);
        Hash.insertaHash(h, m, 223);
        Hash.insertaHash(h, m, 1);
//Buscando un elemento
        elemento = 7;
         i= Hash.buscaHash(h, m, elemento);
         i= Hash.eliminaHash(h, m, 130);
        i= Hash.eliminaHash(h, m, 3423);

    }
}
