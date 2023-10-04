package yo;
/*A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
(i) Genere las clases necesarias. Para cada una provea métodos getters/setters adecuados.
(ii) Implemente los constructores necesarios para iniciar: los clientes a partir de nombre,
DNI, edad; el hotel para N habitaciones, cada una desocupada y con costo aleatorio e/
2000 y 8000.
(iii) Implemente en las clases que corresponda todos los métodos necesarios para:
- Ingresar un cliente C en la habitación número X. Asuma que X es válido (es decir, está
en el rango 1..N) y que la habitación está libre.
- Aumentar el precio de todas las habitaciones en un monto recibido.
- Obtener la representación String del hotel, siguiendo el formato:
{Habitación 1: costo, libre u ocupada, información del cliente si está ocupada}
…
{Habitación N: costo, libre u ocupada, información del cliente si está ocupada}
 */
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Hotel {
    private Habitacion[] Arreglo;
    private int cantidad, dimL;

    public int getCantidad(){
        return cantidad;
    }

    public Habitacion[] getArreglo(){
        return Arreglo;
    }

    public Hotel(int n){
        this.cantidad = n;
        Arreglo = new Habitacion[n];
        this.dimL = -1;
    }

    public void InsertarCliente (int X, Cliente C){
        for (int i=dimL; i>=X; i--){
            Arreglo[i] = Arreglo[i++];
        }
        Arreglo[X].setCli(C);
        this.dimL++;
    }

    public boolean isOcupadaHabN (int N){
        return Arreglo[N].isOcupada();
    }


    public void AumentarCosto(double N){
        for (int i=0; i<=dimL; i++){
            Arreglo[i].setCostoNoche(Arreglo[i].getCostoNoche() + N);
        }
    }
    
    
}