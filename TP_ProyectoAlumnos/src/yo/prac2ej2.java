package yo;
import PaqueteLectura.Lector;
import tema2.Persona;
import PaqueteLectura.GeneradorAleatorio; 
    public class prac2ej2 {

    public static void main(String[] args) {
        Persona[] vector = new Persona[15];
        int i = 0, diml = -1;
        Persona aux = new Persona();

        GeneradorAleatorio.iniciar();
        aux.setDNI(Lector.leerInt());
        aux.setEdad(GeneradorAleatorio.generarInt(100)+1);
        aux.setNombre(GeneradorAleatorio.generarString(20));
       while ((diml < 13) && (aux.getDNI() != 0) ){
            diml++;
            vector[diml] = aux;
            aux = new Persona(GeneradorAleatorio.generarString(20), GeneradorAleatorio.generarInt(20),GeneradorAleatorio.generarInt(100));
        }
        int cantidadMayor65 = 0, min = 9999;
        String representacionmenordni = "aaaa";
        for (int j=0; j<=diml; j++){
            System.out.println(vector[j].toString());
            if (vector[j].getEdad() > 65)
                cantidadMayor65++;
            if (vector[j].getDNI() < min){
                min = vector[j].getDNI();
                representacionmenordni = vector[j].toString();
            }
        }
        System.out.println(representacionmenordni);
        System.out.println(cantidadMayor65);
    } 
}
