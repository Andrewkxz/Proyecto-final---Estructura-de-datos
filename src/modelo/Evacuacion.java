package modelo;
public class Evacuacion {

    private int cantidadPersonas;
    private int nivelPrioridad;

    private Evacuacion(int cantidadPersonas, int nivelPrioridad) {
        this.cantidadPersonas = cantidadPersonas;
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }
    
}
