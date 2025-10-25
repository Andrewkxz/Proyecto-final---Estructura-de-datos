package modelo;
public class Nodo {
    
    private String nombreZona;
    private int nivelRiesgo;
    private InventarioRecursos inventario;

    public Nodo(String nombreZona, int nivelRiesgo) {
        this.nombreZona = nombreZona;
        this.nivelRiesgo = nivelRiesgo;
        this.inventario = new InventarioRecursos();
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public InventarioRecursos getInventario() {
        return inventario;
    }
    
}
