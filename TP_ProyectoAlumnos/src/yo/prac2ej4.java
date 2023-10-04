package yo;
/*4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos
de casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.
 */
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
import tema2.Persona;
public class prac2ej4 {
    public static void main(String[] args) {
        Persona[][] matriz = new Persona[5][8];
        int dia, cantidadtotal = 0;
        int[] dimlPorDia = new int[5];

        for (int i=0; i<5; dimlPorDia[i++] = -1);

        Persona aux = new Persona(Lector.leerString(), GeneradorAleatorio.generarInt(100), GeneradorAleatorio.generarInt(100));
        dia = (Lector.leerInt() - 1);

        while (!(aux.getNombre().equals("Z")) && (cantidadtotal < 40)){
            if (dimlPorDia[dia] < 7){
                dimlPorDia[dia]++;
                matriz[dia][dimlPorDia[dia]] = aux;
                cantidadtotal++;
                aux = new Persona(Lector.leerString(), GeneradorAleatorio.generarInt(100), GeneradorAleatorio.generarInt(100));
                dia = (Lector.leerInt() - 1);
            }
            else {System.out.println ("No quedan turnos en el día, ingrese otro dia");
                 dia = Lector.leerInt();

            }


        }
        for (int i=0; i<5; i++){
            for (int j=0; j<= dimlPorDia[i]; j++){
                System.out.println ((i+1) + ", " + (j+1) + matriz[i][j].toString());

            }
        }
        for (int i=0; i<5; System.out.println (" Para el dia " + (i+1) + " hay " +(dimlPorDia[i++] + 1) + "personas."));
    }
    
}