public class Edificio {
    public static void main(String[] args){

        int ofAc = cantidadoficinasactivas();

        oficina priOf = encontrarprimeroficinaactiva();


        System.out.println("Oficinas Activas: " + ofAc + " " + priOf);


    }

    public static boolean obtenersensor(int piso, int oficina) {
//Ten en cuenta el método obtenersensor, se pide codificar 2 métodos dentro de la clase edificio, que permitan procesar la información de los sensores.
        boolean result = false;
        if (piso == 1) {
            result = true;
        }
        return result;
    }

    public static int cantidadoficinasactivas() {
        //   devolverá la cantidad de oficinas activas del edificio (valor entre 0 y 90).
        int oficinasActivas = 0;

        for (int piso = 1; piso <= 10; piso++) {
            for (int oficina = 1; oficina <= 9; oficina++) {
                if (obtenersensor(piso, oficina)) {
                    oficinasActivas++;
                }
            }
        }
        return oficinasActivas;
    }

    public static oficina encontrarprimeroficinaactiva() {
//    devolverá un objeto de la clase oficina (con los valores de piso y oficina), que representará la primera oficina activa encontrada partiendo desde el primer p
        oficina primerOficina = new oficina();

        outerloop:
        for (int piso1 = 1; piso1 <= 10; piso1++) {
            for (int oficina1 = 1; oficina1 <= 9; oficina1++) {
                if (obtenersensor(piso1, oficina1)) {
                    primerOficina.nro = oficina1;
                    primerOficina.piso = piso1;
                    break outerloop;
                }
            }
        }

        return primerOficina;
    }
}
/*
    Ten en cuenta el método obtenersensor, se pide codificar 2 métodos dentro de la clase edificio, que permitan procesar la información de los sensores.


    public class oficina{

        public int nro;

        public int piso;

    }



    Se espera como resultado el código de ambos métodos y que se exprese su complejidad en notación O (O mayúscula) con una breve descripción de cómo se obtuvo.
}
*/
