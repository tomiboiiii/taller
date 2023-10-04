package yo;

public class Cliente{
    private int DNI, Edad;
    private String Nombre;

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Cliente(int DNI, int Edad, String Nombre) {
        this.DNI = DNI;
        this.Edad = Edad;
        this.Nombre = Nombre;
    }
    
    public Cliente(){
        
    }
    

}