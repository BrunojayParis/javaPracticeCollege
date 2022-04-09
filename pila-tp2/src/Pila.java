public class Pila {
    //Nombre: Bruno Javier Paris
    //Legajo: VINF012105
    //DNI: 37659313
    //Nombre: Bruno Javier Paris
    //Legajo: VINF012105
    //DNI: 37659313
    //Nombre: Bruno Javier Paris
    //Legajo: VINF012105
    //DNI: 37659313


    class Nodo {
        int info;
        Nodo sig;
    }
    private Nodo raiz;
    public Pila () {
        raiz=null;
    }
    public void apilar(int x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    public int desapilar ()
    {
        int ultimo = 0;
        if (raiz != null){
            ultimo = raiz.info; //variable a devolver. El último número de la pila.
            raiz= raiz.sig; //Extraigo el ultimo número.

        }
        else {
            System.out.println("No hay entreros en la lista");// Si no hay números en la pila, se mostrará este mensaje.
        }
        return ultimo;

    }
    public void vercontenido() {
        Nodo todos = raiz; //Apuntamos al primer número de la lista y la recorremos para ver todos sus números.
        while (todos !=null) {
            System.out.println(todos.info);
            todos = todos.sig;
        }
    }
    public static void main(String[] ar) {
        Pila pila1=new Pila();
        pila1.apilar(10);
        pila1.apilar(40);
        pila1.apilar(3);
        pila1.vercontenido ();
        System.out.println("Cima de la pila: "+pila1.desapilar());
        pila1.vercontenido ();
    }
}

