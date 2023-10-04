package yo;
import PaqueteLectura.Lector;
import tema2.Persona;
public class prac2ej1 {

    public static void main(String[] args) {
    Persona p1;
    p1 = new Persona (Lector.leerString(), Lector.leerInt(), Lector.leerInt());
    System.out.println(p1.toString());
    }
}
