package yo;

import PaqueteLectura.GeneradorAleatorio;

/*3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals. */

import PaqueteLectura.Lector;
import tema2.Persona;
public class prac2ej3 {
    public static void main(String[] args) {
        Persona[][] casting = new Persona[5][8];
        int dl1 = 0, dl2 = -1; int contador =0;
        Persona aux;
        GeneradorAleatorio.iniciar();
       // aux = new Persona(Lector.leerString(), Lector.leerInt(), Lector.leerInt());
        aux = new Persona(GeneradorAleatorio.generarString(1), GeneradorAleatorio.generarInt(20),GeneradorAleatorio.generarInt(100));
        while (!(aux.getNombre().equals("Z")) &&  (dl1 < 5)){
                dl2++;
                if (dl2 == 8){ 
                    dl2 = 0;
                    dl1++;
                }
                if (dl1 != 5){
                    contador++;
                    casting[dl1][dl2] = aux;
                    aux = new Persona(GeneradorAleatorio.generarString(1), GeneradorAleatorio.generarInt(20),GeneradorAleatorio.generarInt(100));
                }
        }

    System.out.println ("i: " + dl1 + "j: " + dl2);
   

    int i, j = 0, k = 0;
    for (i=0; i<contador; i++){
        System.out.println (j + ", " + k + ": " + casting[j][k].toString());
        k++;
        if (k == 8){
            j++;
            k = 0;
        }

    }
}
}


